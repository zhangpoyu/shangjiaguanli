package org.mypro.front;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mypro.dao.AdminMapper;
import org.mypro.dao.ShangjiaMapper;
import org.mypro.dao.ShangpingMapper;
import org.mypro.entity.ShangjiaExample;
import org.mypro.entity.ShangpingExample;
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
import java.util.*;
@Controller
@RequestMapping(value = "/")
public class IndexController {

	private static final Log logger = LogFactory.getLog(IndexController.class);
	@Autowired
	private AdminMapper admindao;

	@Autowired
	private ShangpingMapper shangpingdao;

	@Autowired
	private ShangjiaMapper shangjiadao;


	@RequestMapping(value = "index")
	public String index(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		logger.debug("GouwucheController.index ......");

		//获取前四的热销商品
		ShangpingExample example = new ShangpingExample();
		ShangpingExample.Criteria criteria = example.createCriteria();

		example.setOrderByClause("xdcs desc");

		List rexiaoall = shangpingdao.selectByExample(example);

		List rexiao4 = new ArrayList();

		if(rexiaoall.size() >= 4){
			for (int i = 0;i < 4;i++){
				rexiao4.add(rexiaoall.get(i));
			}
		}else{
			rexiao4 = rexiaoall;
		}

		request.setAttribute("rexiao4", rexiao4);



		//获取前五的新款商品
		ShangpingExample example2 = new ShangpingExample();
		ShangpingExample.Criteria criteria2 = example2.createCriteria();

		example.setOrderByClause("id desc");

		List zuixinall = shangpingdao.selectByExample(example2);

		List zuixin5 = new ArrayList();

		if(zuixinall.size() >= 5){
			for (int i = 0;i < 5;i++){
				zuixin5.add(zuixinall.get(i));
			}
		}else{
			zuixin5 = zuixinall;
		}

		request.setAttribute("zuixin5", zuixin5);





		//随机获取三个商家
		ShangjiaExample example3 = new ShangjiaExample();
		ShangjiaExample.Criteria criteria3 = example3.createCriteria();


		List shangjiaall = shangjiadao.selectByExample(example3);



		List suijishangjia3 = null;
		if(shangjiaall.size() > 3){
		Collections.shuffle(shangjiaall);
		suijishangjia3 = shangjiaall.subList(shangjiaall.size() - 4, shangjiaall.size() - 1);
		}else{
			suijishangjia3 = shangjiaall;
		}
		request.setAttribute("suijishangjia3", suijishangjia3);



		//随机获取三个商品
		ShangpingExample example4 = new ShangpingExample();
		ShangpingExample.Criteria criteria4 = example4.createCriteria();


		List suijispaall = shangpingdao.selectByExample(example4);



		List suijishangping3 = null;
		if(suijispaall.size() > 3){
		Collections.shuffle(suijispaall);
		suijishangping3 = suijispaall.subList(suijispaall.size() - 4, suijispaall.size() - 1);
		}else{
			suijishangping3 = suijispaall;
		}
		request.setAttribute("suijishangping3", suijishangping3);


		return "index";
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
