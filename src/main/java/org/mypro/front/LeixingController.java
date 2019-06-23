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
import org.mypro.dao.LeixingMapper;
import org.mypro.entity.Leixing;
import org.mypro.entity.LeixingExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping(value = "/")
public class LeixingController {
	
	private static final Log logger = LogFactory.getLog(LeixingController.class);
	@Autowired
	private LeixingMapper leixingdao;

			@RequestMapping(value = "tianjialeixing")
    	public String tianjialeixing(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("LeixingController.tianjialeixing ......");
    		
    		return "tianjialeixing";
    	}















			@RequestMapping(value = "tianjialeixingact")
	public String tianjialeixingact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Leixing leixing) {
		logger.debug("LeixingController.tianjialeixingact ......");
		leixingdao.insert(leixing);
		
		request.setAttribute("message", "添加类型成功");
		return "forward:/tianjialeixing.action";
	}

			@RequestMapping(value = "leixingguanli")
	public String leixingguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("LeixingController.leixingguanli ......");
		
		LeixingExample example = new LeixingExample();
		
		
		List leixingall = leixingdao.selectByExample(example);
		
		request.setAttribute("leixingall", leixingall);
		
		return "leixingguanli";
	}

			@RequestMapping(value = "leixingchakan")
	public String leixingchakan(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("LeixingController.leixingchakan ......");
		
		LeixingExample example = new LeixingExample();
		
		
		List leixingall = leixingdao.selectByExample(example);
		
		request.setAttribute("leixingall", leixingall);
		
		return "leixingchakan";
	}

			@RequestMapping(value = "xiugaileixing")
	public String xiugaileixing(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("LeixingController.xiugaileixing ......");
		
		Leixing leixing = leixingdao.selectByPrimaryKey(id);
		
		
		request.setAttribute("leixing", leixing);
		
		return "xiugaileixing";
	}

			@RequestMapping(value = "xiugaileixingact")
	public String xiugaileixingact(HttpServletRequest request, HttpServletResponse response,Leixing leixing,HttpSession session) throws IOException {
		logger.debug("LeixingController.xiugaileixingact ......");
		leixingdao.updateByPrimaryKeySelective(leixing);
		
		request.setAttribute("message", "修改类型信息成功");
		
		return "forward:/leixingguanli.action";
	}



			@RequestMapping(value = "shanchuleixing")
	public String shanchuleixing(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("LeixingController.shanchuleixing ......");
		
		leixingdao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除类型成功");
		
		return "forward:/leixingguanli.action";
	}



			@RequestMapping(value = "sousuoleixing")
	public String sousuoleixing(HttpServletRequest request, HttpServletResponse response,HttpSession session,String search) {
		logger.debug("LeixingController.sousuoleixing ......");
		
		LeixingExample example = new LeixingExample();
		LeixingExample.Criteria criteria = example.createCriteria();
		if(search != null){
			criteria.andLeixingLike("%" + search + "%");
		}		
		List leixingall = leixingdao.selectByExample(example);
		request.setAttribute("leixingall", leixingall);
		
		return "sousuoleixing";
	}

			@RequestMapping(value = "leixingxiangqing")
	public String leixingxiangqing(HttpServletRequest request,HttpSession session, HttpServletResponse response,int id) {
		logger.debug("LeixingController.leixingxiangqing ......");
		
		Leixing leixing = leixingdao.selectByPrimaryKey(id);
		request.setAttribute("leixing", leixing);
		
		return "leixingxiangqing";
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
