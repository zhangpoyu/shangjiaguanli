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
import org.mypro.dao.PingjiaMapper;
import org.mypro.dao.ShangpingMapper;
import org.mypro.entity.LeixingExample;
import org.mypro.entity.PingjiaExample;
import org.mypro.entity.Shangjia;
import org.mypro.entity.Shangping;
import org.mypro.entity.ShangpingExample;
import org.mypro.entity.Yonghu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping(value = "/")
public class ShangpingController {
	
	private static final Log logger = LogFactory.getLog(ShangpingController.class);
	@Autowired
	private ShangpingMapper shangpingdao;
	
	@Autowired
	private LeixingMapper leixingdao;
	
	@Autowired
	private PingjiaMapper pingjiadao;

			@RequestMapping(value = "tianjiashangping")
    	public String tianjiashangping(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("ShangpingController.tianjiashangping ......");
    		
    		return "tianjiashangping";
    	}



			@RequestMapping(value = "shangjiatianjiashangping")
    	public String shangjiatianjiashangping(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("ShangpingController.shangjiatianjiashangping ......");
    		
    		LeixingExample example1 = new LeixingExample();
    		List leixingall = leixingdao.selectByExample(example1);
    		request.setAttribute("leixingall", leixingall);
    		
    		return "shangjiatianjiashangping";
    	}



			@RequestMapping(value = "shangjiaxiugaishangping")
	public String shangjiaxiugaishangping(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("ShangpingController.shangjiaxiugaishangping ......");
		
		Shangping shangping = shangpingdao.selectByPrimaryKey(id);
		
		
		request.setAttribute("shangping", shangping);
		
		LeixingExample example1 = new LeixingExample();
		List leixingall = leixingdao.selectByExample(example1);
		request.setAttribute("leixingall", leixingall);
		
		
		return "shangjiaxiugaishangping";
	}



			@RequestMapping(value = "shangjiashangpingguanli")
	public String shangjiashangpingguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("ShangpingController.shangjiashangpingguanli ......");
		
	    Shangjia shangjia = (Shangjia) session.getAttribute("userinfo");
		
		ShangpingExample example = new ShangpingExample();
		
		ShangpingExample.Criteria criteria = example.createCriteria();
		criteria.andShangjiaidEqualTo(shangjia.getId());
		
		List shangpingall = shangpingdao.selectByExample(example);
		
		request.setAttribute("shangpingall", shangpingall);		
		return "shangjiashangpingguanli";
	}

			@RequestMapping(value = "shangjiatianjiashangpingact")
	public String shangjiatianjiashangpingact(MultipartFile tupianfile,HttpServletRequest request,HttpSession session, HttpServletResponse response,Shangping shangping) throws IOException {
		logger.debug("ShangpingController.shangjiatianjiashangpingact ......");
		
		if(!tupianfile.isEmpty()){
			String tupian = uploadUtile(tupianfile, request);
			shangping.setTupian(tupian);
		}
		
		shangpingdao.insert(shangping);
		
		request.setAttribute("message", "添加商品成功");
		return "forward:/shangjiatianjiashangping.action";
	}

			@RequestMapping(value = "tianjiashangpingact")
	public String tianjiashangpingact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Shangping shangping) {
		logger.debug("ShangpingController.tianjiashangpingact ......");
		shangpingdao.insert(shangping);
		
		request.setAttribute("message", "添加商品成功");
		return "forward:/tianjiashangping.action";
	}

			@RequestMapping(value = "shangpingguanli")
	public String shangpingguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("ShangpingController.shangpingguanli ......");
		
		ShangpingExample example = new ShangpingExample();
		
		
		List shangpingall = shangpingdao.selectByExample(example);
		
		request.setAttribute("shangpingall", shangpingall);
		
		return "shangpingguanli";
	}

			@RequestMapping(value = "shangpingchakan")
	public String shangpingchakan(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("ShangpingController.shangpingchakan ......");
		
		ShangpingExample example = new ShangpingExample();
		
		
		List shangpingall = shangpingdao.selectByExample(example);
		
		request.setAttribute("shangpingall", shangpingall);
		
		return "shangpingchakan";
	}

			@RequestMapping(value = "xiugaishangping")
	public String xiugaishangping(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("ShangpingController.xiugaishangping ......");
		
		Shangping shangping = shangpingdao.selectByPrimaryKey(id);
		
		
		request.setAttribute("shangping", shangping);
		
		return "xiugaishangping";
	}

			@RequestMapping(value = "xiugaishangpingact")
	public String xiugaishangpingact(HttpServletRequest request, HttpServletResponse response,Shangping shangping,HttpSession session) throws IOException {
		logger.debug("ShangpingController.xiugaishangpingact ......");
		shangpingdao.updateByPrimaryKeySelective(shangping);
		
		request.setAttribute("message", "修改商品信息成功");
		
		return "forward:/shangpingguanli.action";
	}

			@RequestMapping(value = "shangjiaxiugaishangpingact")
	public String shangjiaxiugaishangpingact(MultipartFile tupianfile,HttpServletRequest request, HttpServletResponse response,Shangping shangping,HttpSession session) throws IOException {
		logger.debug("ShangpingController.shangjiaxiugaishangpingact ......");
		
		
		if(!tupianfile.isEmpty()){
			String tupian = uploadUtile(tupianfile, request);
			shangping.setTupian(tupian);
		}
		
		
		shangpingdao.updateByPrimaryKeySelective(shangping);
		
		request.setAttribute("message", "修改商品信息成功");
		
		return "forward:/shangjiashangpingguanli.action";
	}

			@RequestMapping(value = "shanchushangping")
	public String shanchushangping(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("ShangpingController.shanchushangping ......");
		
		shangpingdao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除商品成功");
		
		return "forward:/shangpingguanli.action";
	}

			@RequestMapping(value = "shangjiashanchushangping")
	public String shangjiashanchushangping(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("ShangpingController.shangjiashanchushangping ......");
		
		shangpingdao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除商品成功");
		
		return "forward:/shangjiashangpingguanli.action";
	}
			
			
			
			
			@RequestMapping(value = "cainixihuan")
			public String cainixihuan(HttpServletRequest request, HttpServletResponse response,HttpSession session,String search,String orderstr,Shangping shangping) {
				logger.debug("ShangpingController.cainixihuan ......");
				
				Yonghu yonghu = (Yonghu) session.getAttribute("userinfo");
				
				if(yonghu == null){
					ShangpingExample example = new ShangpingExample();
					ShangpingExample.Criteria criteria = example.createCriteria();
					List shangpingall = shangpingdao.selectByExample(example);
					request.setAttribute("shangpingall", shangpingall);
					
					return "sousuoshangping";
				}
				
				ShangpingExample example = new ShangpingExample();
				ShangpingExample.Criteria criteria = example.createCriteria();
				
				
				Shangping shangping1 = new Shangping();
				shangping1.setShangjiaid(yonghu.getId());
				List shangpingall = shangpingdao.cainixihuan(shangping1);
				
				if(shangpingall.size() == 0){
					shangpingall = shangpingdao.selectByExample(example);
				}
				
				request.setAttribute("shangpingall", shangpingall);
				
				return "sousuoshangping";
			}
			

			@RequestMapping(value = "sousuoshangping")
	public String sousuoshangping(HttpServletRequest request, HttpServletResponse response,HttpSession session,String search,String orderstr,Shangping shangping) {
		logger.debug("ShangpingController.sousuoshangping ......");
		
		ShangpingExample example = new ShangpingExample();
		ShangpingExample.Criteria criteria = example.createCriteria();
		if(search != null){
			criteria.andShangpingLike("%" + search + "%");
		}	
		
		
		if(orderstr != null){
			example.setOrderByClause(orderstr);
		}	
		
		
		if(shangping.getLeixingid() != null){
			criteria.andLeixingidEqualTo(shangping.getLeixingid());
		}
		
		if(shangping.getShangjiaid() != null){
			criteria.andShangjiaidEqualTo(shangping.getShangjiaid());
		}
		
		
		
		List shangpingall = shangpingdao.selectByExample(example);
		request.setAttribute("shangpingall", shangpingall);
		
		return "sousuoshangping";
	}

			@RequestMapping(value = "shangpingxiangqing")
	public String shangpingxiangqing(HttpServletRequest request,HttpSession session, HttpServletResponse response,int id) {
		logger.debug("ShangpingController.shangpingxiangqing ......");
		
		Shangping shangping = shangpingdao.selectByPrimaryKey(id);
		request.setAttribute("shangping", shangping);
		
		PingjiaExample example = new PingjiaExample();
		PingjiaExample.Criteria criteria = example.createCriteria();
		criteria.andShangpingidEqualTo(id);
		List pingjiaall = pingjiadao.selectByExample(example);
		request.setAttribute("pingjiaall", pingjiaall);
		
		
		return "shangpingxiangqing";
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
