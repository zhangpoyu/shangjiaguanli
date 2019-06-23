package org.mypro.front;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mypro.dao.AdminMapper;
import org.mypro.entity.Admin;
import org.mypro.entity.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping(value = "/")
public class AdminController {

	private static final Log logger = LogFactory.getLog(AdminController.class);
	@Autowired
	private AdminMapper admindao;

			@RequestMapping(value = "tianjiaadmin")
    	public String tianjiaadmin(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("AdminController.tianjiaadmin ......");

    		return "tianjiaadmin";
    	}















			@RequestMapping(value = "tianjiaadminact")
	public String tianjiaadminact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Admin admin) {
		logger.debug("AdminController.tianjiaadminact ......");
		admindao.insert(admin);

		request.setAttribute("message", "添加管理员成功");
		return "forward:/tianjiaadmin.action";
	}

			@RequestMapping(value = "adminguanli")
	public String adminguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("AdminController.adminguanli ......");

		AdminExample example = new AdminExample();


		List adminall = admindao.selectByExample(example);

		request.setAttribute("adminall", adminall);

		return "adminguanli";
	}

			@RequestMapping(value = "adminchakan")
	public String adminchakan(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("AdminController.adminchakan ......");

		AdminExample example = new AdminExample();


		List adminall = admindao.selectByExample(example);

		request.setAttribute("adminall", adminall);

		return "adminchakan";
	}

			@RequestMapping(value = "xiugaiadmin")
	public String xiugaiadmin(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("AdminController.xiugaiadmin ......");

		Admin admin = admindao.selectByPrimaryKey(id);


		request.setAttribute("admin", admin);

		return "xiugaiadmin";
	}

			@RequestMapping(value = "xiugaiadminact")
	public String xiugaiadminact(HttpServletRequest request, HttpServletResponse response,Admin admin,HttpSession session) throws IOException {
		logger.debug("AdminController.xiugaiadminact ......");
		admindao.updateByPrimaryKeySelective(admin);

		request.setAttribute("message", "修改管理员信息成功");

		return "forward:/adminguanli.action";
	}



			@RequestMapping(value = "shanchuadmin")
	public String shanchuadmin(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("AdminController.shanchuadmin ......");

		admindao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除管理员成功");

		return "forward:/adminguanli.action";
	}



			@RequestMapping(value = "sousuoadmin")
	public String sousuoadmin(HttpServletRequest request, HttpServletResponse response,HttpSession session,String search) {
		logger.debug("AdminController.sousuoadmin ......");

		AdminExample example = new AdminExample();
		AdminExample.Criteria criteria = example.createCriteria();
		if(search != null){
			criteria.andUsernameLike("%" + search + "%");
		}
		List adminall = admindao.selectByExample(example);
		request.setAttribute("adminall", adminall);

		return "sousuoadmin";
	}

			@RequestMapping(value = "adminxiangqing")
	public String adminxiangqing(HttpServletRequest request,HttpSession session, HttpServletResponse response,int id) {
		logger.debug("AdminController.adminxiangqing ......");

		Admin admin = admindao.selectByPrimaryKey(id);
		request.setAttribute("admin", admin);

		return "adminxiangqing";
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
