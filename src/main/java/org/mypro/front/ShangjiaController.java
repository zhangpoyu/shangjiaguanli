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
import org.mypro.dao.ShangjiaMapper;
import org.mypro.entity.Shangjia;
import org.mypro.entity.ShangjiaExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping(value = "/")
public class ShangjiaController {
	
	private static final Log logger = LogFactory.getLog(ShangjiaController.class);
	@Autowired
	private ShangjiaMapper shangjiadao;

			@RequestMapping(value = "tianjiashangjia")
    	public String tianjiashangjia(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("ShangjiaController.tianjiashangjia ......");
    		
    		return "tianjiashangjia";
    	}















			@RequestMapping(value = "tianjiashangjiaact")
	public String tianjiashangjiaact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Shangjia shangjia) {
		logger.debug("ShangjiaController.tianjiashangjiaact ......");
		shangjiadao.insert(shangjia);
		
		request.setAttribute("message", "添加商家成功");
		return "forward:/tianjiashangjia.action";
	}

			@RequestMapping(value = "shangjiaguanli")
	public String shangjiaguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("ShangjiaController.shangjiaguanli ......");
		
		ShangjiaExample example = new ShangjiaExample();
		
		
		List shangjiaall = shangjiadao.selectByExample(example);
		
		request.setAttribute("shangjiaall", shangjiaall);
		
		return "shangjiaguanli";
	}

			@RequestMapping(value = "shangjiachakan")
	public String shangjiachakan(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("ShangjiaController.shangjiachakan ......");
		
		ShangjiaExample example = new ShangjiaExample();
		
		
		List shangjiaall = shangjiadao.selectByExample(example);
		
		request.setAttribute("shangjiaall", shangjiaall);
		
		return "shangjiachakan";
	}

			@RequestMapping(value = "xiugaishangjia")
	public String xiugaishangjia(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("ShangjiaController.xiugaishangjia ......");
		
		Shangjia shangjia = shangjiadao.selectByPrimaryKey(id);
		
		
		request.setAttribute("shangjia", shangjia);
		
		return "xiugaishangjia";
	}

			@RequestMapping(value = "xiugaishangjiaact")
	public String xiugaishangjiaact(HttpServletRequest request, HttpServletResponse response,Shangjia shangjia,HttpSession session) throws IOException {
		logger.debug("ShangjiaController.xiugaishangjiaact ......");
		shangjiadao.updateByPrimaryKeySelective(shangjia);
		
		request.setAttribute("message", "修改商家信息成功");
		
		return "forward:/shangjiaguanli.action";
	}



			@RequestMapping(value = "shanchushangjia")
	public String shanchushangjia(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("ShangjiaController.shanchushangjia ......");
		
		shangjiadao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除商家成功");
		
		return "forward:/shangjiaguanli.action";
	}



			@RequestMapping(value = "sousuoshangjia")
	public String sousuoshangjia(HttpServletRequest request, HttpServletResponse response,HttpSession session,String search) {
		logger.debug("ShangjiaController.sousuoshangjia ......");
		
		ShangjiaExample example = new ShangjiaExample();
		ShangjiaExample.Criteria criteria = example.createCriteria();
		if(search != null){
			criteria.andMingziLike("%" + search + "%");
		}		
		List shangjiaall = shangjiadao.selectByExample(example);
		request.setAttribute("shangjiaall", shangjiaall);
		
		return "sousuoshangjia";
	}

			@RequestMapping(value = "shangjiaxiangqing")
	public String shangjiaxiangqing(HttpServletRequest request,HttpSession session, HttpServletResponse response,int id) {
		logger.debug("ShangjiaController.shangjiaxiangqing ......");
		
		Shangjia shangjia = shangjiadao.selectByPrimaryKey(id);
		request.setAttribute("shangjia", shangjia);
		
		return "shangjiaxiangqing";
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
