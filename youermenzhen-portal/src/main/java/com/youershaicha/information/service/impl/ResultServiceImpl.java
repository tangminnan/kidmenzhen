package com.youershaicha.information.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.youershaicha.common.annotation.Log;
import com.youershaicha.common.utils.R;
import com.youershaicha.common.utils.StringUtils;
import com.youershaicha.information.dao.*;
import com.youershaicha.information.domain.*;
import com.youershaicha.information.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ResultServiceImpl implements ResultService{
    @Autowired
    private ChildEyeaxisDao childEyeaxisDao;
    @Autowired
    private ChildOptometryDao childOptometryDao;
    @Autowired
    private ChildDiopterDao childDiopterDao;
    @Autowired
    private ChildCornealDao childCornealDao;
    @Autowired
    private ChildPhotographyDao childPhotographyDao;
    @Autowired
    private ChildRefractionScreeningDao childRefractionScreeningDao;
    @Autowired
    private ChildDao childDao;
    @Autowired
    private ChildBasicDao childBasicDao;
    @Override
    public Map<String, Object> saveResultData(JSONObject obj) {
        Map<String,Object> result = new HashMap<String,Object>();
        /**
         *  基本信息
         */
        String childIdcard=obj.getString("childIdcard");//身份证号
        String childName=obj.getString("childName");//孩子姓名
        Integer age=obj.getInteger("age");//检查年龄段
        Date date = new Date();//检查日期
        ChildDO childDO = childDao.getByChildIdcard(childIdcard);
        ChildDO child = new ChildDO();
        child.setChildName(childName);
        if(childDO!=null){
            child.setChildId(childDO.getChildId());
            childDao.update(child);
        }else {
            child.setChildIdcard(childIdcard);
            childDao.save(child);
        }
        JSONObject jsonObject = obj.getJSONObject("basic");
        if(jsonObject!=null && !"".equals(jsonObject)) {
            ChildBasicDO childBasicDO = new ChildBasicDO();
            /**
             * 外眼检查
             */
            Integer externalRighteyeExaminationType = jsonObject.getInteger("externalRighteyeExaminationType");
            String externalRighteyeExaminationIns = jsonObject.getString("externalRighteyeExaminationIns");
            Integer externalLefteyeExaminationType = jsonObject.getInteger("externalLefteyeExaminationType");
            String externalLefteyeExaminationIns = jsonObject.getString("externalLefteyeExaminationIns");
            String waiyanrightjianchaqita = jsonObject.getString("waiyanrightjianchaqita");
            String waiyanleftjianchaqita = jsonObject.getString("waiyanleftjianchaqita");
            childBasicDO.setExternalRighteyeExaminationType(externalRighteyeExaminationType);
            childBasicDO.setExternalRighteyeExaminationIns(externalRighteyeExaminationIns);
            childBasicDO.setExternalLefteyeExaminationType(externalLefteyeExaminationType);
            childBasicDO.setExternalLefteyeExaminationIns(externalLefteyeExaminationIns);
            childBasicDO.setWaiyanrightjianchaqita(waiyanrightjianchaqita);
            childBasicDO.setWaiyanleftjianchaqita(waiyanleftjianchaqita);
            /**
             * /红光反射
             */
            Integer redlightRighteyeReflexType = jsonObject.getInteger("redlightRighteyeReflexType");
            String redlightRighteyeReflexIns = jsonObject.getString("redlightRighteyeReflexIns");
            Integer redlightLefteyeReflexType = jsonObject.getInteger("redlightLefteyeReflexType");
            String redlightLefteyeReflexIns = jsonObject.getString("redlightLefteyeReflexIns");
            childBasicDO.setRedlightRighteyeReflexType(redlightRighteyeReflexType);
            childBasicDO.setRedlightRighteyeReflexIns(redlightRighteyeReflexIns);
            childBasicDO.setRedlightLefteyeReflexType(redlightLefteyeReflexType);
            childBasicDO.setRedlightLefteyeReflexIns(redlightLefteyeReflexIns);
            /**
             *  视觉行为
             */
            Integer visualbehaviorRighteyeType = jsonObject.getInteger("visualbehaviorRighteyeType");
            Integer visualbehaviorLefteyeType = jsonObject.getInteger("visualbehaviorLefteyeType");
            childBasicDO.setVisualbehaviorRighteyeType(visualbehaviorRighteyeType);
            childBasicDO.setVisualbehaviorLefteyeType(visualbehaviorLefteyeType);
            /**
             *  视力初筛
             */
            Integer primaryScreenOfVisionRighteyeType = jsonObject.getInteger("primaryScreenOfVisionRighteyeType");
            Integer primaryScreenOfVisionLefrteyeType = jsonObject.getInteger("primaryScreenOfVisionLefrteyeType");
            childBasicDO.setPrimaryScreenOfVisionRighteyeType(primaryScreenOfVisionRighteyeType);
            childBasicDO.setPrimaryScreenOfVisionLefrteyeType(primaryScreenOfVisionLefrteyeType);
            /**
             *  选择性注视检测
             */
            String selectiveGazeDetectionRighteye = jsonObject.getString("selectiveGazeDetectionRighteye");
            String selectiveGazeDetectionLefteye = jsonObject.getString("selectiveGazeDetectionLefteye");
            childBasicDO.setSelectiveGazeDetectionRighteye(selectiveGazeDetectionRighteye);
            childBasicDO.setSelectiveGazeDetectionLefteye(selectiveGazeDetectionLefteye);
            /**
             *  眼位检查
             */
            Integer examinationOfPositionRighteyeType = jsonObject.getInteger("examinationOfPositionRighteyeType");
            String examinationOfStrabismusRighteyeType = jsonObject.getString("examinationOfStrabismusRighteyeType");
            String examinationOfStrabismusRighteyeInsn = jsonObject.getString("examinationOfStrabismusRighteyeInsn");
            String examinationOfStrabismusRighteyeInsw = jsonObject.getString("examinationOfStrabismusRighteyeInsw");
            String examinationOfStrabismusRighteyeInsc = jsonObject.getString("examinationOfStrabismusRighteyeInsc");
            Integer examinationOfPositionLefteyeType = jsonObject.getInteger("examinationOfPositionLefteyeType");
            String examinationOfStrabismusLefteyeType = jsonObject.getString("examinationOfStrabismusLefteyeType");
            String examinationOfStrabismusLefteyeInsn = jsonObject.getString("examinationOfStrabismusLefteyeInsn");
            String examinationOfStrabismusLefteyeInsw = jsonObject.getString("examinationOfStrabismusLefteyeInsw");
            String examinationOfStrabismusLefteyeInsc = jsonObject.getString("examinationOfStrabismusLefteyeInsc");
            childBasicDO.setExaminationOfPositionRighteyeType(examinationOfPositionRighteyeType);
            childBasicDO.setExaminationOfStrabismusRighteyeType(examinationOfStrabismusRighteyeType);
            childBasicDO.setExaminationOfStrabismusRighteyeInsn(examinationOfStrabismusRighteyeInsn);
            childBasicDO.setExaminationOfStrabismusRighteyeInsw(examinationOfStrabismusRighteyeInsw);
            childBasicDO.setExaminationOfStrabismusRighteyeInsc(examinationOfStrabismusRighteyeInsc);
            childBasicDO.setExaminationOfPositionLefteyeType(examinationOfPositionLefteyeType);
            childBasicDO.setExaminationOfStrabismusLefteyeType(examinationOfStrabismusLefteyeType);
            childBasicDO.setExaminationOfStrabismusLefteyeInsn(examinationOfStrabismusLefteyeInsn);
            childBasicDO.setExaminationOfStrabismusLefteyeInsw(examinationOfStrabismusLefteyeInsw);
            childBasicDO.setExaminationOfStrabismusLefteyeInsc(examinationOfStrabismusLefteyeInsc);

            /**
             * 眼球运动
             */
            Integer eyemovementRighteyeType = jsonObject.getInteger("eyemovementRighteyeType");
            String eyemovementRighteyeIns = jsonObject.getString("eyemovementRighteyeIns");
            Integer eyemovementLefteyeType = jsonObject.getInteger("eyemovementLefteyeType");
            String eyemovementLefteyeIns = jsonObject.getString("eyemovementLefteyeIns");
            childBasicDO.setEyemovementRighteyeType(eyemovementRighteyeType);
            childBasicDO.setEyemovementRighteyeIns(eyemovementRighteyeIns);
            childBasicDO.setEyemovementLefteyeType(eyemovementLefteyeType);
            childBasicDO.setEyemovementLefteyeIns(eyemovementLefteyeIns);
            /**
             * 检影检查
             */
            Integer filmExaminationType = jsonObject.getInteger("filmExaminationType");
            String filmExaminationRighteyeS = jsonObject.getString("filmExaminationRighteyeS");
            String filmExaminationRighteyeC = jsonObject.getString("filmExaminationRighteyeC");
            String filmExaminationRighteyeA = jsonObject.getString("filmExaminationRighteyeA");
            String filmExaminationLefteyeS = jsonObject.getString("filmExaminationLefteyeS");
            String filmExaminationLefteyeC = jsonObject.getString("filmExaminationLefteyeC");
            String filmExaminationLefteyeA = jsonObject.getString("filmExaminationLefteyeA");
            childBasicDO.setFilmExaminationType(filmExaminationType);
            childBasicDO.setFilmExaminationRighteyeS(filmExaminationRighteyeS);
            childBasicDO.setFilmExaminationRighteyeC(filmExaminationRighteyeC);
            childBasicDO.setFilmExaminationRighteyeA(filmExaminationRighteyeA);
            childBasicDO.setFilmExaminationLefteyeS(filmExaminationLefteyeS);
            childBasicDO.setFilmExaminationLefteyeC(filmExaminationLefteyeC);
            childBasicDO.setFilmExaminationLefteyeA(filmExaminationLefteyeA);
            /**
             * 裸眼视力
             */
            Integer nakedversionType = jsonObject.getInteger("nakedversionType");
            String nakedversionRighteye = jsonObject.getString("nakedversionRighteye");
            String nakedversionLefteye = jsonObject.getString("nakedversionLefteye");
            Integer glassesversionType = jsonObject.getInteger("glassesversionType");
            String glassesversionRighteye = jsonObject.getString("glassesversionRighteye");
            String glassesversionLefteye = jsonObject.getString("glassesversionLefteye");
            childBasicDO.setNakedversionType(nakedversionType);
            childBasicDO.setNakedversionRighteye(nakedversionRighteye);
            childBasicDO.setNakedversionLefteye(nakedversionLefteye);
            childBasicDO.setGlassesversionType(glassesversionType);
            childBasicDO.setGlassesversionRighteye(glassesversionRighteye);
            childBasicDO.setGlassesversionLefteye(glassesversionLefteye);
            /**
             * 色觉检查
             */
            Integer colorversionRighteyeType = jsonObject.getInteger("colorversionRighteyeType");
            String colorversionRighteyeIns = jsonObject.getString("colorversionRighteyeIns");
            Integer colorversionLefteyeType = jsonObject.getInteger("colorversionLefteyeType");
            String colorversionLefteyeIns = jsonObject.getString("colorversionLefteyeIns");
            childBasicDO.setColorversionRighteyeType(colorversionRighteyeType);
            childBasicDO.setColorversionRighteyeIns(colorversionRighteyeIns);
            childBasicDO.setColorversionLefteyeType(colorversionLefteyeType);
            childBasicDO.setColorversionLefteyeIns(colorversionLefteyeIns);
            /**
             *  瞬目反射
             */
            Integer blinkReflexRighteye = jsonObject.getInteger("blinkReflexRighteye");
            Integer blinkReflexLefteye = jsonObject.getInteger("blinkReflexLefteye");
            childBasicDO.setBlinkReflexRighteye(blinkReflexRighteye);
            childBasicDO.setBlinkReflexLefteye(blinkReflexLefteye);

            /**
             *  红球实验
             */
            Integer redballRighteye = jsonObject.getInteger("redballRighteye");
            Integer redballLefteye = jsonObject.getInteger("redballLefteye");
            childBasicDO.setRedballRighteye(redballRighteye);
            childBasicDO.setRedballLefteye(redballLefteye);
            /**
             *  眼球追随运动
             */
            Integer followRighteyeType = jsonObject.getInteger("followRighteyeType");
            String followRighteyeIns = jsonObject.getString("followRighteyeIns");
            Integer followLefteyeType = jsonObject.getInteger("followLefteyeType");
            String followLefteyeIns = jsonObject.getString("followLefteyeIns");
            childBasicDO.setFollowRighteyeType(followRighteyeType);
            childBasicDO.setFollowRighteyeIns(followRighteyeIns);
            childBasicDO.setFollowLefteyeType(followLefteyeType);
            childBasicDO.setFollowLefteyeIns(followLefteyeIns);
            /**
             *  一些保存的基本关键信息
             */
            String chector = jsonObject.getString("chector");
            String conclusion = jsonObject.getString("conclusion");
            String proposal = jsonObject.getString("proposal");
            Date lastCheckDate = jsonObject.getDate("lastCheckDate");
            childBasicDO.setChector(chector);
            childBasicDO.setConclusion(conclusion);
            childBasicDO.setProposal(proposal);
            childBasicDO.setLastCheckDate(lastCheckDate);
            childBasicDO.setAge(age);
            childBasicDO.setChildIdcard(childIdcard);
            childBasicDO.setChildId(child.getChildId());
            childBasicDO.setCheckDate(date);

            /**
             * 2-7岁的结论
             */
            Integer ocularArchitectureRighteyeConclusion = jsonObject.getInteger("ocularArchitectureRighteyeConclusion");
            Integer ocularArchitectureLefteyeConclusion = jsonObject.getInteger("ocularArchitectureLefteyeConclusion");
            String ocularArchitectureRighteye = jsonObject.getString("ocularArchitectureRighteye");
            String ocularArchitectureLefteye = jsonObject.getString("ocularArchitectureLefteye");
            childBasicDO.setOcularArchitectureRighteyeConclusion(ocularArchitectureRighteyeConclusion);
            childBasicDO.setOcularArchitectureLefteyeConclusion(ocularArchitectureLefteyeConclusion);
            childBasicDO.setOcularArchitectureRighteye(ocularArchitectureRighteye);
            childBasicDO.setOcularArchitectureLefteye(ocularArchitectureLefteye);

            childBasicDao.save(childBasicDO);
        }

        /**
         * 眼轴长度
         */
        jsonObject = obj.getJSONObject("eyeaxis");
        if(jsonObject!=null && !"".equals(jsonObject)) {
            Double firstCheckOd = jsonObject.getDouble("firstCheckOd");
            Double firstCheckOs = jsonObject.getDouble("firstCheckOs");
            ChildEyeaxisDO childEyeaxisDO = new ChildEyeaxisDO();
            childEyeaxisDO.setFirstCheckOd(firstCheckOd);
            childEyeaxisDO.setFirstCheckOs(firstCheckOs);
            childEyeaxisDO.setAge(age);
            childEyeaxisDO.setCheckDate(date);
            childEyeaxisDO.setChildIdcard(childIdcard);
            childEyeaxisDao.save(childEyeaxisDO);
        }

        /**
         *  屈光筛查
         */

        jsonObject=obj.getJSONObject("refractionScreening");
        if(jsonObject!=null && !"".equals(jsonObject)) {
            String righteyeDiopterS =  jsonObject.getString("righteyeDiopterS");
            String righteyeDiopterC =  jsonObject.getString("righteyeDiopterC");
            String righteyeDiopterA = jsonObject.getString("righteyeDiopterA");
            String lefteyeDiopterS  =  jsonObject.getString("lefteyeDiopterS");
            String lefteyeDiopterC = jsonObject.getString("lefteyeDiopterC");
            String lefteyeDiopterA = jsonObject.getString("lefteyeDiopterA");
            String righteyeDengxiaoqiujing = jsonObject.getString("righteyeDengxiaoqiujing");
            String lefteyeDengxiaoqiujing = jsonObject.getString("lefteyeDengxiaoqiujing");
            String ouPd = jsonObject.getString("ouPd");
            String osPd = jsonObject.getString("osPd");
            String odPd = jsonObject.getString("odPd");
            Integer righteyeResultType= jsonObject.getInteger("righteyeResultType");
            String righteyeResultIns=  jsonObject.getString("righteyeResultIns");
            Integer lefteyeResultType = jsonObject.getInteger("lefteyeResultType");
            String  lefteyeResultIns = jsonObject.getString("lefteyeResultIns");
            ChildRefractionScreeningDO childRefractionScreeningDO = new ChildRefractionScreeningDO
                    (righteyeDiopterS,righteyeDiopterC,righteyeDiopterA,
                    lefteyeDiopterS,
                    lefteyeDiopterC,lefteyeDiopterA,righteyeDengxiaoqiujing,lefteyeDengxiaoqiujing,
                    ouPd,osPd,odPd,righteyeResultType,
                    righteyeResultIns,lefteyeResultType,lefteyeResultIns,age,childIdcard,date);
            childRefractionScreeningDao.save(childRefractionScreeningDO);
        }


        /**
         *  广域眼底照相
         */

        jsonObject = obj.getJSONObject("photography");
        if(jsonObject!=null && !"".equals(jsonObject)) {
            String picrs="",picls="";
            JSONArray jsona = jsonObject.getJSONArray("picRighteye");
            if(jsona!=null && jsona.size()>0){
                picrs = jsona.toJSONString();
            }
            jsona = jsonObject.getJSONArray("picLefteye");
            if(jsona!=null && jsona.size()>0){
                picls = jsona.toJSONString();
            }
            String conclusionS=jsonObject.getString("conclusion");
            ChildPhotographyDO childPhotographyDO = new ChildPhotographyDO();
            childPhotographyDO.setPicRighteye(picrs);
            childPhotographyDO.setPicLefteye(picls);
            childPhotographyDO.setConclusion(conclusionS);
            childPhotographyDO.setChildIdcard(childIdcard);
            childPhotographyDO.setAge(age);
            childPhotographyDO.setCheckDate(date);
            childPhotographyDao.save(childPhotographyDO);
        }

        /**
         *  电脑验光数据
         */
        jsonObject =obj.getJSONObject("optometry");
        if(jsonObject!=null && !"".equals(jsonObject)) {
            Double firstCheckVd = jsonObject.getDouble("firstCheckVd");
            Double firstCheckRps = jsonObject.getDouble("firstCheckRps");
            Double firstCheckLps = jsonObject.getDouble("firstCheckLps");
            Double firstCheckRcs = jsonObject.getDouble("firstCheckRcs");
            Double firstCheckLcs = jsonObject.getDouble("firstCheckLcs");
            Double secondCheckVd = jsonObject.getDouble("secondCheckVd");
            Double secondCheckRps = jsonObject.getDouble("secondCheckRps");
            Double secondCheckLps = jsonObject.getDouble("secondCheckLps");
            Double secondCheckRcs = jsonObject.getDouble("secondCheckRcs");
            Double secondCheckLcs = jsonObject.getDouble("secondCheckLcs");
            Double firstCheckPd = jsonObject.getDouble("firstCheckPd");
            Double secondCheckPd = jsonObject.getDouble("secondCheckPd");
            ChildOptometryDO childOptometryDO = new ChildOptometryDO(childIdcard,age, firstCheckVd, firstCheckPd, secondCheckPd, firstCheckRps, firstCheckLps, firstCheckRcs, firstCheckLcs, date,
                    secondCheckVd, secondCheckRps, secondCheckLps, secondCheckRcs, secondCheckLcs, 0);
			childOptometryDao.save(childOptometryDO);
            JSONArray jsonArray = obj.getJSONArray("diopter");
            if(jsonArray!=null && jsonArray.size()>0) {
                for (int j = 0; j < jsonArray.size(); j++) {
                    JSONObject jb = jsonArray.getJSONObject(j);
                    Double diopterS = jb.getDouble("diopterS");
                    Double diopterC = jb.getDouble("diopterC");
                    Double diopterA = jb.getDouble("diopterA");
                    Integer believe = jb.getInteger("believe");
                    String firstSecond = jb.getString("firstSecond");
                    Integer num = jb.getInteger("num");
                    String type = jb.getString("type");
                    String ifrl = jb.getString("ifrl");
                    ChildDiopterDO childDiopterDO = new ChildDiopterDO(childIdcard, age,date, childOptometryDO.getTOptometryId(), diopterS, diopterC, diopterA, believe, num, type, ifrl, firstSecond);
                    //计算等效球镜
                    if (diopterS != null && diopterC != null) {
                        childDiopterDO.setDengxiaoqiujing(diopterS + 1.0 / 2 * diopterC);
                    }

                    childDiopterDao.save(childDiopterDO);
                }
            }
            jsonArray = obj.getJSONArray("corneal");
            if(jsonArray!=null && jsonArray.size()>0) {
                for (int j = 0; j < jsonArray.size(); j++) {
                    JSONObject jb = jsonArray.getJSONObject(j);
                    Double cornealMm = jb.getDouble("cornealMm");
                    Double cornealD = jb.getDouble("cornealD");
                    Integer cornealDeg = jb.getInteger("cornealDeg");
                    String type = jb.getString("type");
                    String ifrl = jb.getString("ifrl");
                    String firstSecond = jb.getString("firstSecond");
                    ChildCornealDO childCornealDO = new ChildCornealDO(childIdcard,age,date,childOptometryDO.getTOptometryId(), cornealMm, cornealD, cornealDeg, type, ifrl, firstSecond);
                    childCornealDao.save(childCornealDO) ;              }
            }
        }

        result.put("code", 0);
        result.put("msg","上传数据成功");
        return result;
    }

    @Log("获取检查数据")
    @Override
    public Map<String, Object> getResultData(String childIdcard, Integer age) {
        Map<String,Object> resultMap = new HashMap<String,Object>();
        ChildDO childDO = childDao.getByChildIdcard(childIdcard);
        if(childDO==null){
            resultMap.put("data",-1);
            resultMap.put("msg","找不到孩子的信息,看一下输入的身份证号是否有误");
            return resultMap;
        }

        Map<String,Object> paramsMap = new HashMap<String,Object>();
        paramsMap.put("childIdcard",childIdcard);
        if(age==null) age=-1;
        paramsMap.put("age",age);

        /**
         *  查询基本检查信息
         */
        ChildBasicDO childBasicDO = childBasicDao.getRecentlyBasic(paramsMap);
        if(childBasicDO==null) childBasicDO = new ChildBasicDO();

        /**
         *  查询广域眼底照相
         */
        ChildPhotographyDO childPhotographyDO = childPhotographyDao.getRecentChildPhotographyDO(paramsMap);
        if(childPhotographyDO==null) childPhotographyDO=new ChildPhotographyDO();

        /**
         * 查询屈光筛查
         */
        ChildRefractionScreeningDO childRefractionScreeningDO = childRefractionScreeningDao.getRecentChildRefractionScreeningDO(paramsMap);
        if(childRefractionScreeningDO==null) childRefractionScreeningDO = new ChildRefractionScreeningDO();
        /**
         *  查询眼轴长度
         */

        ChildEyeaxisDO childEyeaxisDO = childEyeaxisDao.getChildEyeaxisDO(paramsMap);
        if(childEyeaxisDO==null) childEyeaxisDO=new ChildEyeaxisDO();

        /**
         * 查询电脑验光
         */
        List<ChildDiopterDO> diopterDOs = new ArrayList<ChildDiopterDO>();
        List<ChildCornealDO> cornealDOs = new ArrayList<ChildCornealDO>();
        ChildOptometryDO childOptometryDO = childOptometryDao.getRecentChildOptometryDO(paramsMap);
        if(childOptometryDO==null) childOptometryDO = new ChildOptometryDO();
        if(childOptometryDO!=null) {
            diopterDOs = childDiopterDao.getChildDiopterDOList(childOptometryDO.getTOptometryId());
            cornealDOs = childCornealDao.getChildChildCornealDOList(childOptometryDO.getTOptometryId());
        }
        resultMap.put("childOptometryDO",childOptometryDO);
        resultMap.put("childDiopterDOS",diopterDOs);
        resultMap.put("childCornealDOS",cornealDOs);
        resultMap.put("childDO",childDO);
        resultMap.put("childBasicDO",childBasicDO);
        resultMap.put("childPhotographyDO",childPhotographyDO);
        resultMap.put("childRefractionScreeningDO",childRefractionScreeningDO);
        resultMap.put("childEyeaxisDO",childEyeaxisDO);
        resultMap.put("code",0);
        return resultMap;

    }
}
