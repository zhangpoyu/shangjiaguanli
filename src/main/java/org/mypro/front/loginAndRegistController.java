package org.mypro.front;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.mypro.dao.YonghuMapper;
import org.mypro.entity.Yonghu;
import org.mypro.entity.YonghuExample;
import org.mypro.dao.AdminMapper;
import org.mypro.entity.Admin;
import org.mypro.entity.AdminExample;
import org.mypro.dao.ShangjiaMapper;
import org.mypro.entity.Shangjia;
import org.mypro.entity.ShangjiaExample;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping(value = "/")
public class loginAndRegistController {
	
	private static final Log logger = LogFactory.getLog(loginAndRegistController.class);

@Autowired
	private YonghuMapper yonghudao;

@Autowired
	private AdminMapper admindao;

@Autowired
	private ShangjiaMapper shangjiadao;


			@RequestMapping(value = "login")
    	public String login(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("loginAndRegistController.login ......");
    		
    		return "login";
    	}

			@RequestMapping(value = "regist")
    	public String regist(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("loginAndRegistController.regist ......");
    		
    		return "regist";
    	}

			@RequestMapping(value = "loginact")
	public String loginact(HttpServletRequest request, HttpServletResponse response,Admin admin,String shenfen,HttpSession session) {
		logger.debug("loginAndRegistController.loginact ......");
			if("用户".equals(shenfen)){
			YonghuExample example = new YonghuExample();
			YonghuExample.Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(admin.getUsername());
			criteria.andPasswordEqualTo(admin.getPassword());
			List admins = yonghudao.selectByExample(example);
			
			if(admins.isEmpty()){
				request.setAttribute("message", "账号或密码错误");
				return "login";
			}else{
				session.setAttribute("userinfo", admins.get(0));
				session.setAttribute("shenfen", shenfen);
				return "yonghuindex";
			}
		}
			if("管理员".equals(shenfen)){
			AdminExample example = new AdminExample();
			AdminExample.Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(admin.getUsername());
			criteria.andPasswordEqualTo(admin.getPassword());
			List admins = admindao.selectByExample(example);
			
			if(admins.isEmpty()){
				request.setAttribute("message", "账号或密码错误");
				return "login";
			}else{
				session.setAttribute("userinfo", admins.get(0));
				session.setAttribute("shenfen", shenfen);
				return "adminindex";
			}
		}
			if("商家".equals(shenfen)){
			ShangjiaExample example = new ShangjiaExample();
			ShangjiaExample.Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(admin.getUsername());
			criteria.andPasswordEqualTo(admin.getPassword());
			List admins = shangjiadao.selectByExample(example);
			
			if(admins.isEmpty()){
				request.setAttribute("message", "账号或密码错误");
				return "login";
			}else{
				session.setAttribute("userinfo", admins.get(0));
				session.setAttribute("shenfen", shenfen);
				return "shangjiaindex";
			}
		}			request.setAttribute("message", "请选择登录身份");
			return "login";
		
		
		
	}

			@RequestMapping(value = "registact")
	public String registact(HttpServletRequest request, HttpServletResponse response,Admin admin,String shenfen,HttpSession session,String repassword) {
		logger.debug("loginAndRegistController.registact ......");       if( !repassword.equals(admin.getPassword())){
				request.setAttribute("message", "两次密码不一致");
 return "regist";		}
			if("用户".equals(shenfen)){
			YonghuExample example = new YonghuExample();
			YonghuExample.Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(admin.getUsername());
			List admins = yonghudao.selectByExample(example);
			Yonghu yonghu = new Yonghu();
           yonghu.setUsername(admin.getUsername());
			yonghu.setPassword(admin.getPassword());
			
			if(!admins.isEmpty()){
				request.setAttribute("message", "该账号已存在");
				return "regist";
			}else{
				yonghudao.insert(yonghu);
				request.setAttribute("message", "注册成功，请登录");
				return "login";
			}
		}
			if("管理员".equals(shenfen)){
			AdminExample example = new AdminExample();
			AdminExample.Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(admin.getUsername());
			List admins = admindao.selectByExample(example);
			
			if(!admins.isEmpty()){
				request.setAttribute("message", "该账号已存在");
				return "login";
			}else{
				admindao.insert(admin);
				request.setAttribute("message", "注册成功，请登录");
				return "login";
			}
		}
			if("商家".equals(shenfen)){
			ShangjiaExample example = new ShangjiaExample();
			ShangjiaExample.Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(admin.getUsername());
			List admins = shangjiadao.selectByExample(example);
			Shangjia shangjia = new Shangjia();
           shangjia.setUsername(admin.getUsername());
			shangjia.setPassword(admin.getPassword());
			
			if(!admins.isEmpty()){
				request.setAttribute("message", "该账号已存在");
				return "regist";
			}else{
				shangjiadao.insert(shangjia);
				request.setAttribute("message", "注册成功，请登录");
				return "login";
			}
		}			request.setAttribute("message", "请选择登录身份");
			return "regist";
		
		
		
	}

			@RequestMapping(value = "tuichuxitong")
	public String tuichuxitong(HttpServletRequest request, HttpServletResponse response,Admin admin,HttpSession session) {
		logger.debug("loginAndRegistController.tuichuxitong ......");
		session.invalidate();
		
		return "login";
	}

			@RequestMapping(value = "yonghuindex")
	public String yonghuindex(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("loginAndRegistController.yonghuindex ......");
		
		return "yonghuindex";
	}			@RequestMapping(value = "adminindex")
	public String adminindex(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("loginAndRegistController.adminindex ......");
		
		return "adminindex";
	}			@RequestMapping(value = "shangjiaindex")
	public String shangjiaindex(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("loginAndRegistController.shangjiaindex ......");
		
		return "shangjiaindex";
	}
			@RequestMapping(value = "yonghuxiugaigerenxinxiact")
	public String yonghuxiugaigerenxinxiact(HttpServletRequest request, HttpServletResponse response,Yonghu yonghu,HttpSession session) {
		logger.debug("loginAndRegistController.yonghuxiugaigerenxinxiact ......");
		
		
		yonghudao.updateByPrimaryKey(yonghu);
		
		session.setAttribute("userinfo", yonghu);
		
		request.setAttribute("message", "修改个人信息成功");
		return "yonghuindex";
	}
			@RequestMapping(value = "adminxiugaigerenxinxiact")
	public String adminxiugaigerenxinxiact(HttpServletRequest request, HttpServletResponse response,Admin admin,HttpSession session) {
		logger.debug("loginAndRegistController.adminxiugaigerenxinxiact ......");
		
		
		admindao.updateByPrimaryKey(admin);
		
		session.setAttribute("userinfo", admin);
		
		request.setAttribute("message", "修改个人信息成功");
		return "adminindex";
	}
			@RequestMapping(value = "shangjiaxiugaigerenxinxiact")
	public String shangjiaxiugaigerenxinxiact(HttpServletRequest request, HttpServletResponse response,Shangjia shangjia,HttpSession session) {
		logger.debug("loginAndRegistController.shangjiaxiugaigerenxinxiact ......");
		
		
		shangjiadao.updateByPrimaryKey(shangjia);
		
		session.setAttribute("userinfo", shangjia);
		
		request.setAttribute("message", "修改个人信息成功");
		return "shangjiaindex";
	}

//	上传文件图片等
	public String uploadUtile(MultipartFile file, HttpServletRequest request) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
        String res = sdf.format(new Date());
        // uploads文件夹位置
        String rootPath = request.getSession().getServletContext().getRealPath("resource/uploads/");
        // 原始名称
        String originalFileName = file.getOriginalFilename();
        // 新文件名
        String newFileName = "sliver" + res + originalFileName.substring(originalFileName.lastIndexOf("."));
        // 创建年月文件夹
        Calendar date = Calendar.getInstance();
        File dateDirs = new File(date.get(Calendar.YEAR) + File.separator + (date.get(Calendar.MONTH)+1));
        // 新文件
        File newFile = new File(rootPath + File.separator + dateDirs + File.separator + newFileName);
        // 判断目标文件所在目录是否存在
        if( !newFile.getParentFile().exists()) {
            // 如果目标文件所在的目录不存在，则创建父目录
            newFile.getParentFile().mkdirs();
        }
        System.out.println(newFile);
        // 将内存中的数据写入磁盘
        file.transferTo(newFile);
        // 完整的url
        String fileUrl = date.get(Calendar.YEAR) + "/" + (date.get(Calendar.MONTH)+1) + "/" + newFileName;
        return  fileUrl;
    }}
