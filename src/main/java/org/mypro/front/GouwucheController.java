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
import org.mypro.dao.GouwucheMapper;
import org.mypro.entity.Gouwuche;
import org.mypro.entity.GouwucheExample;
import org.mypro.entity.Shangping;
import org.mypro.entity.ShangpingExample;
import org.mypro.dao.ShangpingMapper;
import org.mypro.entity.Yonghu;
import org.mypro.entity.YonghuExample;
import org.mypro.dao.YonghuMapper;
import org.mypro.entity.Shangjia;
import org.mypro.entity.ShangjiaExample;
import org.mypro.dao.ShangjiaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping(value = "/")
public class GouwucheController {
	
	private static final Log logger = LogFactory.getLog(GouwucheController.class);
	@Autowired
	private GouwucheMapper gouwuchedao;
	@Autowired
	private ShangpingMapper shangpingdao;
	@Autowired
	private YonghuMapper yonghudao;
	@Autowired
	private ShangjiaMapper shangjiadao;

	@RequestMapping(value = "tianjiagouwuche")
	public String tianjiagouwuche(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		logger.debug("GouwucheController.tianjiagouwuche ......");
		ShangpingExample example1 = new ShangpingExample();
		List shangpingall = shangpingdao.selectByExample(example1);
		request.setAttribute("shangpingall", shangpingall);
		YonghuExample example2 = new YonghuExample();
		List yonghuall = yonghudao.selectByExample(example2);
		request.setAttribute("yonghuall", yonghuall);
		ShangjiaExample example3 = new ShangjiaExample();
		List shangjiaall = shangjiadao.selectByExample(example3);
		request.setAttribute("shangjiaall", shangjiaall);
		
		return "tianjiagouwuche";
	}



	@RequestMapping(value = "yonghutianjiagouwuche")
	public String yonghutianjiagouwuche(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		logger.debug("GouwucheController.yonghutianjiagouwuche ......");
		ShangpingExample example1 = new ShangpingExample();
		List shangpingall = shangpingdao.selectByExample(example1);
		request.setAttribute("shangpingall", shangpingall);
		YonghuExample example2 = new YonghuExample();
		List yonghuall = yonghudao.selectByExample(example2);
		request.setAttribute("yonghuall", yonghuall);
		ShangjiaExample example3 = new ShangjiaExample();
		List shangjiaall = shangjiadao.selectByExample(example3);
		request.setAttribute("shangjiaall", shangjiaall);
		
		return "yonghutianjiagouwuche";
	}



	@RequestMapping(value = "yonghuxiugaigouwuche")
	public String yonghuxiugaigouwuche(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("GouwucheController.yonghuxiugaigouwuche ......");
		
		Gouwuche gouwuche = gouwuchedao.selectByPrimaryKey(id);
		
    		ShangpingExample example1 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example1);
    		request.setAttribute("shangpingall", shangpingall);
    		YonghuExample example2 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example2);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangjiaExample example3 = new ShangjiaExample();
    		List shangjiaall = shangjiadao.selectByExample(example3);
    		request.setAttribute("shangjiaall", shangjiaall);
		
		request.setAttribute("gouwuche", gouwuche);
		
		return "yonghuxiugaigouwuche";
	}



			@RequestMapping(value = "yonghugouwucheguanli")
	public String yonghugouwucheguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("GouwucheController.yonghugouwucheguanli ......");
		
	    Yonghu yonghu = (Yonghu) session.getAttribute("userinfo");
		
		GouwucheExample example = new GouwucheExample();
		
		GouwucheExample.Criteria criteria = example.createCriteria();
		criteria.andYonghuidEqualTo(yonghu.getId());
		
		List gouwucheall = gouwuchedao.selectByExample(example);
		
		request.setAttribute("gouwucheall", gouwucheall);		
		return "yonghugouwucheguanli";
	}

			@RequestMapping(value = "yonghutianjiagouwucheact")
	public String yonghutianjiagouwucheact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Gouwuche gouwuche) {
		logger.debug("GouwucheController.yonghutianjiagouwucheact ......");
		gouwuchedao.insert(gouwuche);
		
		request.setAttribute("message", "添加购物车成功");
		return "forward:/yonghutianjiagouwuche.action";
	}

			@RequestMapping(value = "tianjiagouwucheact")
	public String tianjiagouwucheact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Gouwuche gouwuche) {
		logger.debug("GouwucheController.tianjiagouwucheact ......");
		gouwuchedao.insert(gouwuche);
		
		request.setAttribute("message", "添加购物车成功");
		return "forward:/tianjiagouwuche.action";
	}

			@RequestMapping(value = "gouwucheguanli")
	public String gouwucheguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("GouwucheController.gouwucheguanli ......");
		
		GouwucheExample example = new GouwucheExample();
		
		
		List gouwucheall = gouwuchedao.selectByExample(example);
		
		request.setAttribute("gouwucheall", gouwucheall);
		
		return "gouwucheguanli";
	}

			@RequestMapping(value = "gouwuchechakan")
	public String gouwuchechakan(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("GouwucheController.gouwuchechakan ......");
		
		GouwucheExample example = new GouwucheExample();
		
		
		List gouwucheall = gouwuchedao.selectByExample(example);
		
		request.setAttribute("gouwucheall", gouwucheall);
		
		return "gouwuchechakan";
	}

			@RequestMapping(value = "xiugaigouwuche")
	public String xiugaigouwuche(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("GouwucheController.xiugaigouwuche ......");
		
		Gouwuche gouwuche = gouwuchedao.selectByPrimaryKey(id);
		
    		ShangpingExample example1 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example1);
    		request.setAttribute("shangpingall", shangpingall);
    		YonghuExample example2 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example2);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangjiaExample example3 = new ShangjiaExample();
    		List shangjiaall = shangjiadao.selectByExample(example3);
    		request.setAttribute("shangjiaall", shangjiaall);
		
		request.setAttribute("gouwuche", gouwuche);
		
		return "xiugaigouwuche";
	}

			@RequestMapping(value = "xiugaigouwucheact")
	public String xiugaigouwucheact(HttpServletRequest request, HttpServletResponse response,Gouwuche gouwuche,HttpSession session) throws IOException {
		logger.debug("GouwucheController.xiugaigouwucheact ......");
		gouwuchedao.updateByPrimaryKeySelective(gouwuche);
		
		request.setAttribute("message", "修改购物车信息成功");
		
		return "forward:/gouwucheguanli.action";
	}

			@RequestMapping(value = "yonghuxiugaigouwucheact")
	public String yonghuxiugaigouwucheact(HttpServletRequest request, HttpServletResponse response,Gouwuche gouwuche,HttpSession session) throws IOException {
		logger.debug("GouwucheController.yonghuxiugaigouwucheact ......");
		gouwuchedao.updateByPrimaryKeySelective(gouwuche);
		
		request.setAttribute("message", "修改购物车信息成功");
		
		return "forward:/yonghugouwucheguanli.action";
	}

			@RequestMapping(value = "shanchugouwuche")
	public String shanchugouwuche(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("GouwucheController.shanchugouwuche ......");
		
		gouwuchedao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除购物车成功");
		
		return "forward:/gouwucheguanli.action";
	}

			@RequestMapping(value = "yonghushanchugouwuche")
	public String yonghushanchugouwuche(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("GouwucheController.yonghushanchugouwuche ......");
		
		gouwuchedao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除购物车成功");
		
		return "forward:/yonghugouwucheguanli.action";
	}

			@RequestMapping(value = "sousuogouwuche")
	public String sousuogouwuche(HttpServletRequest request, HttpServletResponse response,HttpSession session,String search) {
		logger.debug("GouwucheController.sousuogouwuche ......");
		
		GouwucheExample example = new GouwucheExample();
		GouwucheExample.Criteria criteria = example.createCriteria();
		if(search != null){
			criteria.andShangpingLike("%" + search + "%");
		}		
		List gouwucheall = gouwuchedao.selectByExample(example);
		request.setAttribute("gouwucheall", gouwucheall);
		
		return "sousuogouwuche";
	}

			@RequestMapping(value = "gouwuchexiangqing")
	public String gouwuchexiangqing(HttpServletRequest request,HttpSession session, HttpServletResponse response,int id) {
		logger.debug("GouwucheController.gouwuchexiangqing ......");
		
		Gouwuche gouwuche = gouwuchedao.selectByPrimaryKey(id);
		request.setAttribute("gouwuche", gouwuche);
		
		return "gouwuchexiangqing";
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
