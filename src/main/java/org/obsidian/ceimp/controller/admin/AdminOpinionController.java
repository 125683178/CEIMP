package org.obsidian.ceimp.controller.admin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.ManagerBean;
import org.obsidian.ceimp.bean.NationalGrantOpinionAjaxBean;
import org.obsidian.ceimp.bean.NationalGrantOpinionBean;
import org.obsidian.ceimp.entity.ScholarshipOpinion;
import org.obsidian.ceimp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BillChen on 2017/10/16.
 */
@Controller
public class AdminOpinionController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private NationalinspirationalscholarshipService nationalinspirationalscholarshipService;

    @Autowired
    private ProvincialgovernmentscholarshipService provincialgovernmentscholarshipService;

    @Autowired
    private SchoolscholarshipService schoolscholarshipService;

    @Autowired
    private TripleastudentService tripleastudentService;

    @Autowired
    private ScholarshipOpinionSerivce scholarshipOpinionSerivce;

    @Autowired
    private NationalGrantService nationalGrantService;

    @RequestMapping(value = "/m/admin/opinion/nationalinspirationalscholarship",method = RequestMethod.GET)
    public String writeNationalinspirationalscholarship(HttpSession session, Model model){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        ScholarshipOpinion scholarshipOpinion = scholarshipOpinionSerivce.selectByManagerId(managerId);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinion);
        return "scholarship/admin/write/writeNationalinspirationalscholarship";
    }
    @RequestMapping(value = "/m/admin/opinion/provincialgovernmentscholarship",method = RequestMethod.GET)
    public String writeProvincialgovernmentscholarship(HttpSession session, Model model){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        ScholarshipOpinion scholarshipOpinion = scholarshipOpinionSerivce.selectByManagerId(managerId);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinion);
        return "scholarship/admin/write/writeProvincialgovernmentscholarship";
    }
    @RequestMapping(value = "/m/admin/opinion/schoolscholarship",method = RequestMethod.GET)
    public String writeSchoolscholarship(HttpSession session, Model model){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        ScholarshipOpinion scholarshipOpinion = scholarshipOpinionSerivce.selectByManagerId(managerId);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinion);
        return "scholarship/admin/write/writeSchoolscholarship";
    }
    @RequestMapping(value = "/m/admin/opinion/tripleastudent",method = RequestMethod.GET)
    public String writeTripleastudent(HttpSession session, Model model){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        ScholarshipOpinion scholarshipOpinion = scholarshipOpinionSerivce.selectByManagerId(managerId);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinion);
        return "scholarship/admin/write/writeTripleastudent";
    }
    @RequestMapping(value = "/m/admin/opinion/nationalGrant", method = RequestMethod.GET)
    public String writeNationalGrant(Model model){
        List<NationalGrantOpinionBean> list = nationalGrantService.selectAllNationalGrantOpinion();
        model.addAttribute("nationalGrantOpinionBean",list);
        return "scholarship/admin/write/writeNationalGrant";
    }



    @RequestMapping(value = "/m/admin/opinion/nationalinspirationalscholarship/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeNationalinspirationalscholarshipSubmit(HttpSession session,HttpServletRequest request){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        String opinion = request.getParameter("opinion");
        return scholarshipOpinionSerivce.updateNationalOpinion(managerId,opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/provincialgovernmentscholarship/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeProvincialgovernmentscholarshipSubmit(HttpSession session,HttpServletRequest request){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        String recommendReason = request.getParameter("recommendReason");
        String opinion = request.getParameter("opinion");
        return scholarshipOpinionSerivce.updateProvincialRecommendAndProvincialOpinion(managerId,recommendReason,opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/schoolscholarship/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeSchoolscholarshipSubmit(HttpSession session,HttpServletRequest request){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        String opinion = request.getParameter("opinion");
        return scholarshipOpinionSerivce.updateSchoolOpinion(managerId,opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/tripleastudent/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeTripleastudentSubmit(HttpSession session,HttpServletRequest request){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        String opinion = request.getParameter("opinion");
        return scholarshipOpinionSerivce.updateTripleaOpinion(managerId,opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/nationalGrant/submit", method = RequestMethod.POST)
    @ResponseBody
    public String writeNationalGrantSubmit(HttpServletRequest request){
        int updateSum = 0;
        String jsonStr = request.getParameter("nationalGrantOpinionBean");
        String opinion = request.getParameter("opinion");
        List<NationalGrantOpinionBean> list = new ArrayList<>(JSONArray.parseArray(jsonStr, NationalGrantOpinionBean.class));
        for(int i=0;i<list.size();i++){
            nationalGrantService.updateNationalGrant(list.get(i).getUser_id(),opinion);
            updateSum++;
        }
        List<NationalGrantOpinionBean> nationalGrantOpinionBeanList = nationalGrantService.selectAllNationalGrantOpinion();
        NationalGrantOpinionAjaxBean nationalGrantOpinionAjaxBean = new NationalGrantOpinionAjaxBean();
        nationalGrantOpinionAjaxBean.setCode(0);
        nationalGrantOpinionAjaxBean.setMsg("");
        nationalGrantOpinionAjaxBean.setCount(updateSum);
        nationalGrantOpinionAjaxBean.setData(nationalGrantOpinionBeanList);
        return JSON.toJSONString(nationalGrantOpinionAjaxBean);
    }
}
