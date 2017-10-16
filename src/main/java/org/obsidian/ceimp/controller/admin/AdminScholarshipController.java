package org.obsidian.ceimp.controller.admin;

import com.alibaba.fastjson.JSONArray;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.DeleteUtil;
import org.obsidian.ceimp.util.DownloadUtil;
import org.obsidian.ceimp.util.ZipUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BillChen on 2017/9/11.
 */
@Controller
public class AdminScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private UserssService userssService;

    @Autowired
    private TripleastudentService tripleastudentService;

    @Autowired
    private NationalinspirationalscholarshipService nationalinspirationalscholarshipService;

    @Autowired
    private ProvincialgovernmentscholarshipService provincialgovernmentscholarshipService;

    @Autowired
    private SchoolscholarshipService schoolscholarshipService;

//    @RequestMapping(value = "/admin/scholarship")
//    public String adminScholarship(Model model){
//        return "admin/scholarship";
//    }

    @RequestMapping(value = "/m/admin/showNationalInspirationalScholarship", method = RequestMethod.GET)
	public String showNationalInspirationalScholarship(Model model){
        List<NationalinspirationalscholarshipShowBean> list = nationalinspirationalscholarshipService.selectAllNationalinspirationalscholarship();
    	model.addAttribute("nationalinspirationalscholarshipShowBean",list);
        return "scholarship/admin/show/showNationalInspirationalScholarship";
	}
	@RequestMapping(value = "/m/admin/showProvincialgovernmentscholarship", method = RequestMethod.GET)
    public String showProvincialgovernmentscholarship(Model model){
	    List<ProvincialgovernmentscholarshipShowBean> list = provincialgovernmentscholarshipService.selectAllProvincialgovernmentscholarship();
        model.addAttribute("provincialgovernmentscholarshipShowBean",list);
        return "scholarship/admin/show/showProvincialgovernmentscholarship";
	}
	@RequestMapping(value = "/m/admin/showSchoolscholarship", method = RequestMethod.GET)
    public String showSchoolscholarship(Model model){
        List<SchoolscholarshipShowBean> list = schoolscholarshipService.selectAllSchoolscholarship();
        model.addAttribute("schoolscholarshipShowBean",list);
        return "scholarship/admin/show/showSchoolscholarship";
    }
	@RequestMapping(value = "/m/admin/showTripleastudent", method = RequestMethod.GET)
    public String showTripleastudent(Model model){
        List<TripleastudentShowBean> list = tripleastudentService.selectAllTripleastudent();
        model.addAttribute("tripleastudentShowBean",list);
        return "scholarship/admin/show/showTripleastudent";
    }


    @RequestMapping(value = "/m/admin/zip", method = RequestMethod.GET)
    public void zip(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String jsonStr = request.getParameter("zipBean");
        List<ZipBean> zipBeans = new ArrayList<>(JSONArray.parseArray(jsonStr, ZipBean.class));
        List<String> list = new ArrayList<>();
        for(int i=0;i<zipBeans.size();i++){
            list.add(zipBeans.get(i).getUserId() + zipBeans.get(i).getUsername() + zipBeans.get(i).getAward());
        }
        ZipBean zipBean = zipBeans.get(0);
        String award = "";
        String awardName = "";
        if(zipBean.getAward().equals("国家励志奖学金")){
            award = "nationalInspirationalScholarship";
            awardName = "国家励志奖学金";
        }
        else if(zipBean.getAward().equals("省政府奖学金")){
            award = "provincialGovernmentScholarship";
            awardName = "省政府奖学金";
        }
        else if(zipBean.getAward().equals("三好学生")){
            award = "tripleAStudent";
            awardName = "三好学生";
        }
        else{
            award = "schoolScholarship";
            awardName = "校奖学金";
        }
        //服务器路径Windows
//        String inputUrl = System.getProperty("user.dir") + "\\classes\\award\\" + award;
//        String outputUrl = System.getProperty("user.dir") + "\\classes\\award\\zip";
        //服务器路径Linux
        String inputUrl = System.getProperty("user.dir") + "/classes/award/" + award;
        String outputUrl = System.getProperty("user.dir") + "/classes/award/zip";

        //本地路径
//        String inputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" + award;
//        String outputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\zip";
        ZipUtil.getInstance().zip(inputUrl,outputUrl,awardName,list);

        //Windows
//        DownloadUtil.getInstance().download(outputUrl + "\\" + awardName + ".zip",response,awardName + ".zip");
//        DeleteUtil.getInstance().delete(outputUrl + "\\" + awardName + ".zip");

        //Linux
        DownloadUtil.getInstance().download(outputUrl + "/" + awardName + ".zip",response,awardName + ".zip");
        DeleteUtil.getInstance().delete(outputUrl + "/" + awardName + ".zip");
    }
    @RequestMapping(value = "/m/admin/delete", method = RequestMethod.GET)
    @ResponseBody
    public int delete(HttpServletRequest request){
        int isDelete = 0;
        String userId = request.getParameter("userId");
        String username = request.getParameter("username");
        String award = request.getParameter("award");
        String awardUrl = "";
        if(award.equals("国家励志奖学金")){
            //服务器路径Windows
//            awardUrl = System.getProperty("user.dir") + "\\classes\\award\\" +
//                    "nationalInspirationalScholarship\\" + userId + username + award + ".docx";
            //服务器路径Linux
            awardUrl = System.getProperty("user.dir") + "/classes/award/" +
                    "nationalInspirationalScholarship/" + userId + username + award + ".docx";

            //本地路径
//            awardUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" +
//                    "nationalInspirationalScholarship\\" + userId + username + award + ".docx";
            nationalinspirationalscholarshipService.deleteNationalinspirationalscholarship(userId);
            DeleteUtil.getInstance().delete(awardUrl);
            isDelete = 1;
        }
        else if(award.equals("省政府奖学金")){
            //服务器路径Windows
//            awardUrl = System.getProperty("user.dir") + "\\classes\\award\\" +
//                    "provincialGovernmentScholarship\\" + userId + username + award + ".docx";
            //服务器路径Linux
            awardUrl = System.getProperty("user.dir") + "/classes/award/" +
                    "provincialGovernmentScholarship/" + userId + username + award + ".docx";

            //本地路径
//            awardUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" +
//                    "provincialGovernmentScholarship\\" + userId + username + award + ".docx";
            provincialgovernmentscholarshipService.deleteProvincialgovernmentscholarship(userId);
            DeleteUtil.getInstance().delete(awardUrl);
            isDelete = 1;
        }
        else if(award.equals("三好学生")){
            //服务器路径Windows
//            awardUrl = System.getProperty("user.dir") + "\\classes\\award\\" +
//                    "tripleAStudent\\" + userId + username + award + ".docx";
            //服务器路径Linux
            awardUrl = System.getProperty("user.dir") + "/classes/award/" +
                    "tripleAStudent/" + userId + username + award + ".docx";

            //本地路径
//            awardUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" +
//                    "tripleAStudent\\" + userId + username + award + ".docx";
            tripleastudentService.deleteTripleastudent(userId);
            DeleteUtil.getInstance().delete(awardUrl);
            isDelete = 1;
        }
        else{
            //服务器路径Windows
//            awardUrl = System.getProperty("user.dir") + "\\classes\\award\\" +
//                    "schoolScholarship\\" + userId + username + award + ".docx";
            //服务器路径Linux
            awardUrl = System.getProperty("user.dir") + "/classes/award/" +
                    "schoolScholarship/" + userId + username + award + ".docx";

            //本地路径
//            awardUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" +
//                    "schoolScholarship\\" + userId + username + award + ".docx";
            schoolscholarshipService.deleteSchoolscholarshipByUserIdAndLevel(userId,award);
            DeleteUtil.getInstance().delete(awardUrl);
            isDelete = 1;
        }
        return isDelete;
    }
}
