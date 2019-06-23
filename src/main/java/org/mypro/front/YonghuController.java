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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping(value = "/")
public class YonghuController {
	
	private static final Log logger = LogFactory.getLog(YonghuController.class);
	@Autowired
	private YonghuMapper yonghudao;

			@RequestMapping(value = "tianjiayonghu")
    	public String tianjiayonghu(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("YonghuController.tianjiayonghu ......");
    		
    		return "tianjiayonghu";
    	}















			@RequestMapping(value = "tianjiayonghuact")
	public String tianjiayonghuact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Yonghu yonghu) {
		logger.debug("YonghuController.tianjiayonghuact ......");
		yonghudao.insert(yonghu);
		
		request.setAttribute("message", "添加用户成功");
		return "forward:/tianjiayonghu.action";
	}

			@RequestMapping(value = "yonghuguanli")
	public String yonghuguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("YonghuController.yonghuguanli ......");
		
		YonghuExample example = new YonghuExample();
		
		
		List yonghuall = yonghudao.selectByExample(example);
		
		request.setAttribute("yonghuall", yonghuall);
		
		return "yonghuguanli";
	}

			@RequestMapping(value = "yonghuchakan")
	public String yonghuchakan(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("YonghuController.yonghuchakan ......");
		
		YonghuExample example = new YonghuExample();
		
		
		List yonghuall = yonghudao.selectByExample(example);
		
		request.setAttribute("yonghuall", yonghuall);
		
		return "yonghuchakan";
	}

			@RequestMapping(value = "xiugaiyonghu")
	public String xiugaiyonghu(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("YonghuController.xiugaiyonghu ......");
		
		Yonghu yonghu = yonghudao.selectByPrimaryKey(id);
		
		
		request.setAttribute("yonghu", yonghu);
		
		return "xiugaiyonghu";
	}

			@RequestMapping(value = "xiugaiyonghuact")
	public String xiugaiyonghuact(HttpServletRequest request, HttpServletResponse response,Yonghu yonghu,HttpSession session) throws IOException {
		logger.debug("YonghuController.xiugaiyonghuact ......");
		yonghudao.updateByPrimaryKeySelective(yonghu);
		
		request.setAttribute("message", "修改用户信息成功");
		
		return "forward:/yonghuguanli.action";
	}



			@RequestMapping(value = "shanchuyonghu")
	public String shanchuyonghu(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("YonghuController.shanchuyonghu ......");
		
		yonghudao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除用户成功");
		
		return "forward:/yonghuguanli.action";
	}



			@RequestMapping(value = "sousuoyonghu")
	public String sousuoyonghu(HttpServletRequest request, HttpServletResponse response,HttpSession session,String search) {
		logger.debug("YonghuController.sousuoyonghu ......");
		
		YonghuExample example = new YonghuExample();
		YonghuExample.Criteria criteria = example.createCriteria();
		if(search != null){
			criteria.andMingziLike("%" + search + "%");
		}		
		List yonghuall = yonghudao.selectByExample(example);
		request.setAttribute("yonghuall", yonghuall);
		
		return "sousuoyonghu";
	}

			@RequestMapping(value = "yonghuxiangqing")
	public String yonghuxiangqing(HttpServletRequest request,HttpSession session, HttpServletResponse response,int id) {
		logger.debug("YonghuController.yonghuxiangqing ......");
		
		Yonghu yonghu = yonghudao.selectByPrimaryKey(id);
		request.setAttribute("yonghu", yonghu);
		
		return "yonghuxiangqing";
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
