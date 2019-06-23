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
import org.mypro.dao.PingjiaMapper;
import org.mypro.dao.ShangjiaMapper;
import org.mypro.entity.DingdanExample;
import org.mypro.entity.Pingjia;
import org.mypro.entity.PingjiaExample;
import org.mypro.entity.Shangjia;
import org.mypro.entity.ShangjiaExample;
import org.mypro.entity.Yonghu;
import org.mypro.entity.YonghuExample;
import org.mypro.dao.YonghuMapper;
import org.mypro.entity.Shangping;
import org.mypro.entity.ShangpingExample;
import org.mypro.dao.ShangpingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping(value = "/")
public class PingjiaController {
	
	private static final Log logger = LogFactory.getLog(PingjiaController.class);
	@Autowired
	private PingjiaMapper pingjiadao;
	@Autowired
	private YonghuMapper yonghudao;
	@Autowired
	private ShangpingMapper shangpingdao;
	@Autowired
	private ShangjiaMapper shangjiadao;

			@RequestMapping(value = "tianjiapingjia")
    	public String tianjiapingjia(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("PingjiaController.tianjiapingjia ......");
    		YonghuExample example1 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example1);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangpingExample example2 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example2);
    		request.setAttribute("shangpingall", shangpingall);
    		
    		return "tianjiapingjia";
    	}



			@RequestMapping(value = "yonghutianjiapingjia")
    	public String yonghutianjiapingjia(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("PingjiaController.yonghutianjiapingjia ......");
    		YonghuExample example1 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example1);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangpingExample example2 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example2);
    		request.setAttribute("shangpingall", shangpingall);
    		
    		ShangjiaExample example3 = new ShangjiaExample();
    		List shangjiaall = shangjiadao.selectByExample(example3);
    		request.setAttribute("shangjiaall", shangjiaall);
    		
    		return "yonghutianjiapingjia";
    	}



			@RequestMapping(value = "yonghuxiugaipingjia")
	public String yonghuxiugaipingjia(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("PingjiaController.yonghuxiugaipingjia ......");
		
		Pingjia pingjia = pingjiadao.selectByPrimaryKey(id);
		
    		YonghuExample example1 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example1);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangpingExample example2 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example2);
    		request.setAttribute("shangpingall", shangpingall);
		
		request.setAttribute("pingjia", pingjia);
		
		return "yonghuxiugaipingjia";
	}



			@RequestMapping(value = "yonghupingjiaguanli")
	public String yonghupingjiaguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("PingjiaController.yonghupingjiaguanli ......");
		
	    Yonghu yonghu = (Yonghu) session.getAttribute("userinfo");
		
		PingjiaExample example = new PingjiaExample();
		
		PingjiaExample.Criteria criteria = example.createCriteria();
		criteria.andYonghuidEqualTo(yonghu.getId());
		
		List pingjiaall = pingjiadao.selectByExample(example);
		
		request.setAttribute("pingjiaall", pingjiaall);		
		return "yonghupingjiaguanli";
	}

			@RequestMapping(value = "yonghutianjiapingjiaact")
	public String yonghutianjiapingjiaact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Pingjia pingjia) {
		logger.debug("PingjiaController.yonghutianjiapingjiaact ......");
		pingjiadao.insert(pingjia);
		
		request.setAttribute("message", "添加评价成功");
		return "forward:/yonghutianjiapingjia.action";
	}

			@RequestMapping(value = "tianjiapingjiaact")
	public String tianjiapingjiaact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Pingjia pingjia) {
		logger.debug("PingjiaController.tianjiapingjiaact ......");
		pingjiadao.insert(pingjia);
		
		request.setAttribute("message", "添加评价成功");
		return "forward:/tianjiapingjia.action";
	}

			@RequestMapping(value = "pingjiaguanli")
	public String pingjiaguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("PingjiaController.pingjiaguanli ......");
		
		PingjiaExample example = new PingjiaExample();
		
		
		List pingjiaall = pingjiadao.selectByExample(example);
		
		request.setAttribute("pingjiaall", pingjiaall);
		
		return "pingjiaguanli";
	}

			@RequestMapping(value = "pingjiachakan")
	public String pingjiachakan(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("PingjiaController.pingjiachakan ......");
		
		
		Shangjia shangjia = (Shangjia) session.getAttribute("userinfo");
		
		PingjiaExample example = new PingjiaExample();
		PingjiaExample.Criteria criteria = example.createCriteria();
		criteria.andShanghuidEqualTo(shangjia.getId());
		
		List pingjiaall = pingjiadao.selectByExample(example);
		
		request.setAttribute("pingjiaall", pingjiaall);
		
		return "pingjiachakan";
	}

			@RequestMapping(value = "xiugaipingjia")
	public String xiugaipingjia(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("PingjiaController.xiugaipingjia ......");
		
		Pingjia pingjia = pingjiadao.selectByPrimaryKey(id);
		
    		YonghuExample example1 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example1);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangpingExample example2 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example2);
    		request.setAttribute("shangpingall", shangpingall);
		
		request.setAttribute("pingjia", pingjia);
		
		return "xiugaipingjia";
	}

			@RequestMapping(value = "xiugaipingjiaact")
	public String xiugaipingjiaact(HttpServletRequest request, HttpServletResponse response,Pingjia pingjia,HttpSession session) throws IOException {
		logger.debug("PingjiaController.xiugaipingjiaact ......");
		pingjiadao.updateByPrimaryKeySelective(pingjia);
		
		request.setAttribute("message", "修改评价信息成功");
		
		return "forward:/pingjiaguanli.action";
	}

			@RequestMapping(value = "yonghuxiugaipingjiaact")
	public String yonghuxiugaipingjiaact(HttpServletRequest request, HttpServletResponse response,Pingjia pingjia,HttpSession session) throws IOException {
		logger.debug("PingjiaController.yonghuxiugaipingjiaact ......");
		pingjiadao.updateByPrimaryKeySelective(pingjia);
		
		request.setAttribute("message", "修改评价信息成功");
		
		return "forward:/yonghupingjiaguanli.action";
	}

			@RequestMapping(value = "shanchupingjia")
	public String shanchupingjia(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("PingjiaController.shanchupingjia ......");
		
		pingjiadao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除评价成功");
		
		return "forward:/pingjiaguanli.action";
	}

			@RequestMapping(value = "yonghushanchupingjia")
	public String yonghushanchupingjia(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("PingjiaController.yonghushanchupingjia ......");
		
		pingjiadao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除评价成功");
		
		return "forward:/yonghupingjiaguanli.action";
	}

			@RequestMapping(value = "sousuopingjia")
	public String sousuopingjia(HttpServletRequest request, HttpServletResponse response,HttpSession session,String search) {
		logger.debug("PingjiaController.sousuopingjia ......");
		
		PingjiaExample example = new PingjiaExample();
		PingjiaExample.Criteria criteria = example.createCriteria();
		if(search != null){
			criteria.andNeirongLike("%" + search + "%");
		}		
		List pingjiaall = pingjiadao.selectByExample(example);
		request.setAttribute("pingjiaall", pingjiaall);
		
		return "sousuopingjia";
	}

			@RequestMapping(value = "pingjiaxiangqing")
	public String pingjiaxiangqing(HttpServletRequest request,HttpSession session, HttpServletResponse response,int id) {
		logger.debug("PingjiaController.pingjiaxiangqing ......");
		
		Pingjia pingjia = pingjiadao.selectByPrimaryKey(id);
		request.setAttribute("pingjia", pingjia);
		
		return "pingjiaxiangqing";
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
