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
import org.mypro.dao.DingdanMapper;
import org.mypro.entity.Dingdan;
import org.mypro.entity.DingdanExample;
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
public class DingdanController {
	
	private static final Log logger = LogFactory.getLog(DingdanController.class);
	@Autowired
	private DingdanMapper dingdandao;
	@Autowired
	private ShangpingMapper shangpingdao;
	@Autowired
	private YonghuMapper yonghudao;
	@Autowired
	private ShangjiaMapper shangjiadao;

			@RequestMapping(value = "tianjiadingdan")
    	public String tianjiadingdan(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("DingdanController.tianjiadingdan ......");
    		ShangpingExample example1 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example1);
    		request.setAttribute("shangpingall", shangpingall);
    		YonghuExample example2 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example2);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangjiaExample example3 = new ShangjiaExample();
    		List shangjiaall = shangjiadao.selectByExample(example3);
    		request.setAttribute("shangjiaall", shangjiaall);
    		
    		return "tianjiadingdan";
    	}
			
			@RequestMapping(value = "peisongdingdan")
	    	public String peisongdingdan(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id) {
	    		logger.debug("DingdanController.peisongdingdan ......");
	    		
	    		Dingdan dingdan = dingdandao.selectByPrimaryKey(id);
	    		dingdan.setZhuangtai("配送中");
	    		dingdandao.updateByPrimaryKeySelective(dingdan);
	    		request.setAttribute("message", "已配送，等待用户签收");
	    		
	    		return "forward:/dingdanchakan.action";
	    	}
			
			
			@RequestMapping(value = "shouhuodingdan")
	    	public String shouhuodingdan(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id) {
	    		logger.debug("DingdanController.shouhuodingdan ......");
	    		
	    		Dingdan dingdan = dingdandao.selectByPrimaryKey(id);
	    		dingdan.setZhuangtai("已签收");
	    		dingdandao.updateByPrimaryKeySelective(dingdan);
	    		request.setAttribute("message", "签收完成，对订单进行评价吧。");
	    		
	    		return "forward:/yonghudingdanguanli.action";
	    	}
			


			@RequestMapping(value = "yonghutianjiadingdan")
    	public String yonghutianjiadingdan(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    		logger.debug("DingdanController.yonghutianjiadingdan ......");
    		ShangpingExample example1 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example1);
    		request.setAttribute("shangpingall", shangpingall);
    		YonghuExample example2 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example2);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangjiaExample example3 = new ShangjiaExample();
    		List shangjiaall = shangjiadao.selectByExample(example3);
    		request.setAttribute("shangjiaall", shangjiaall);
    		
    		return "yonghutianjiadingdan";
    	}



			@RequestMapping(value = "yonghuxiugaidingdan")
	public String yonghuxiugaidingdan(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("DingdanController.yonghuxiugaidingdan ......");
		
		Dingdan dingdan = dingdandao.selectByPrimaryKey(id);
		
    		ShangpingExample example1 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example1);
    		request.setAttribute("shangpingall", shangpingall);
    		YonghuExample example2 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example2);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangjiaExample example3 = new ShangjiaExample();
    		List shangjiaall = shangjiadao.selectByExample(example3);
    		request.setAttribute("shangjiaall", shangjiaall);
		
		request.setAttribute("dingdan", dingdan);
		
		return "yonghuxiugaidingdan";
	}



			@RequestMapping(value = "yonghudingdanguanli")
	public String yonghudingdanguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("DingdanController.yonghudingdanguanli ......");
		
	    Yonghu yonghu = (Yonghu) session.getAttribute("userinfo");
		
		DingdanExample example = new DingdanExample();
		
		DingdanExample.Criteria criteria = example.createCriteria();
		criteria.andYonghuidEqualTo(yonghu.getId());
		
		List dingdanall = dingdandao.selectByExample(example);
		
		request.setAttribute("dingdanall", dingdanall);		
		return "yonghudingdanguanli";
	}

			@RequestMapping(value = "yonghutianjiadingdanact")
	public String yonghutianjiadingdanact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Dingdan dingdan) {
		logger.debug("DingdanController.yonghutianjiadingdanact ......");
		
		Shangping shangping = shangpingdao.selectByPrimaryKey(dingdan.getShangpingid());
		
		if(Integer.parseInt(shangping.getShuliang()) < Integer.parseInt(dingdan.getShuliang())){
			request.setAttribute("message", "商品数量不足");
			return "forward:/yonghutianjiadingdan.action?shangpingid=" + dingdan.getShangpingid() + "&shanghuid=" + dingdan.getShangjiaid() + "&jiage=" + dingdan.getJiage();
		}
		
		shangping.setShuliang(String.valueOf(Integer.parseInt(shangping.getShuliang()) - Integer.parseInt(dingdan.getShuliang())));
		
		shangpingdao.updateByPrimaryKeySelective(shangping);
		
		dingdandao.insert(dingdan);
		
		request.setAttribute("message", "添加订单成功");
		return "forward:/yonghutianjiadingdan.action?shangpingid=" + dingdan.getShangpingid() + "&shanghuid=" + dingdan.getShangjiaid() + "&jiage=" + dingdan.getJiage();
	}

			@RequestMapping(value = "tianjiadingdanact")
	public String tianjiadingdanact(HttpServletRequest request,HttpSession session, HttpServletResponse response,Dingdan dingdan) {
		logger.debug("DingdanController.tianjiadingdanact ......");
		dingdandao.insert(dingdan);
		
		request.setAttribute("message", "添加订单成功");
		return "forward:/tianjiadingdan.action";
	}

			@RequestMapping(value = "dingdanguanli")
	public String dingdanguanli(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("DingdanController.dingdanguanli ......");
		
		DingdanExample example = new DingdanExample();
		
		
		List dingdanall = dingdandao.selectByExample(example);
		
		request.setAttribute("dingdanall", dingdanall);
		
		return "dingdanguanli";
	}

			@RequestMapping(value = "dingdanchakan")
	public String dingdanchakan(HttpServletRequest request,HttpSession session, HttpServletResponse response) {
		logger.debug("DingdanController.dingdanchakan ......");
		
		Shangjia shangjia = (Shangjia) session.getAttribute("userinfo");
		
		DingdanExample example = new DingdanExample();
		DingdanExample.Criteria criteria = example.createCriteria();
		criteria.andShangjiaidEqualTo(shangjia.getId());
		
		List dingdanall = dingdandao.selectByExample(example);
		
		request.setAttribute("dingdanall", dingdanall);
		
		return "dingdanchakan";
	}

			@RequestMapping(value = "xiugaidingdan")
	public String xiugaidingdan(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("DingdanController.xiugaidingdan ......");
		
		Dingdan dingdan = dingdandao.selectByPrimaryKey(id);
		
    		ShangpingExample example1 = new ShangpingExample();
    		List shangpingall = shangpingdao.selectByExample(example1);
    		request.setAttribute("shangpingall", shangpingall);
    		YonghuExample example2 = new YonghuExample();
    		List yonghuall = yonghudao.selectByExample(example2);
    		request.setAttribute("yonghuall", yonghuall);
    		ShangjiaExample example3 = new ShangjiaExample();
    		List shangjiaall = shangjiadao.selectByExample(example3);
    		request.setAttribute("shangjiaall", shangjiaall);
		
		request.setAttribute("dingdan", dingdan);
		
		return "xiugaidingdan";
	}

			@RequestMapping(value = "xiugaidingdanact")
	public String xiugaidingdanact(HttpServletRequest request, HttpServletResponse response,Dingdan dingdan,HttpSession session) throws IOException {
		logger.debug("DingdanController.xiugaidingdanact ......");
		dingdandao.updateByPrimaryKeySelective(dingdan);
		
		request.setAttribute("message", "修改订单信息成功");
		
		return "forward:/dingdanguanli.action";
	}

			@RequestMapping(value = "yonghuxiugaidingdanact")
	public String yonghuxiugaidingdanact(HttpServletRequest request, HttpServletResponse response,Dingdan dingdan,HttpSession session) throws IOException {
		logger.debug("DingdanController.yonghuxiugaidingdanact ......");
		dingdandao.updateByPrimaryKeySelective(dingdan);
		
		request.setAttribute("message", "修改订单信息成功");
		
		return "forward:/yonghudingdanguanli.action";
	}

			@RequestMapping(value = "shanchudingdan")
	public String shanchudingdan(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("DingdanController.shanchudingdan ......");
		
		dingdandao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除订单成功");
		
		return "forward:/dingdanguanli.action";
	}

			@RequestMapping(value = "yonghushanchudingdan")
	public String yonghushanchudingdan(HttpServletRequest request, HttpServletResponse response,HttpSession session,int id){
		logger.debug("DingdanController.yonghushanchudingdan ......");
		
		dingdandao.deleteByPrimaryKey(id);
		
		request.setAttribute("message", "删除订单成功");
		
		return "forward:/yonghudingdanguanli.action";
	}

			@RequestMapping(value = "sousuodingdan")
	public String sousuodingdan(HttpServletRequest request, HttpServletResponse response,HttpSession session,String search) {
		logger.debug("DingdanController.sousuodingdan ......");
		
		DingdanExample example = new DingdanExample();
		DingdanExample.Criteria criteria = example.createCriteria();
		if(search != null){
			criteria.andShangpingLike("%" + search + "%");
		}		
		List dingdanall = dingdandao.selectByExample(example);
		request.setAttribute("dingdanall", dingdanall);
		
		return "sousuodingdan";
	}

			@RequestMapping(value = "dingdanxiangqing")
	public String dingdanxiangqing(HttpServletRequest request,HttpSession session, HttpServletResponse response,int id) {
		logger.debug("DingdanController.dingdanxiangqing ......");
		
		Dingdan dingdan = dingdandao.selectByPrimaryKey(id);
		request.setAttribute("dingdan", dingdan);
		
		return "dingdanxiangqing";
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
