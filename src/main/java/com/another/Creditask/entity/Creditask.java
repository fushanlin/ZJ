package com.another.Creditask.entity;

import java.util.Date;
/**
 * 
 */
public class Creditask {

    private Integer id;      //
    private Integer companyid;      //申请公司ID
    private Date createtime;      //
    private String foreigncontractnum;      //外商合同编号
    private String contractnum;      //中实合同编号
    private Integer foreignid;      //外商ID
    private String amount;      //金额
    private Integer Loadingportid;      //装货港口
    private Integer dischargeportid;      //卸货港口
    private Integer notifyingbankid;      //通知银行
    private Date paymenterm;      //付款期限
    private Date deliveryterm;      //交单期限
    private Date opentime;      //开出日期
    private String expirationadr;      //到期地点
    private Integer packagingid;      //包装方式id
    private Integer countriesid;      //国别ID
    private Integer transfer;      //是否转运
    private Integer split;      //是否分批


    public Creditask(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getCompanyid(){
        return companyid;
    }

    public void setCompanyid(Integer companyid){
        this.companyid = companyid;
    }
    public Date getCreatetime(){
        return createtime;
    }

    public void setCreatetime(Date createtime){
        this.createtime = createtime;
    }
    public String getForeigncontractnum(){
        return foreigncontractnum;
    }

    public void setForeigncontractnum(String foreigncontractnum){
        this.foreigncontractnum = foreigncontractnum;
    }
    public String getContractnum(){
        return contractnum;
    }

    public void setContractnum(String contractnum){
        this.contractnum = contractnum;
    }
    public Integer getForeignid(){
        return foreignid;
    }

    public void setForeignid(Integer foreignid){
        this.foreignid = foreignid;
    }
    public String getAmount(){
        return amount;
    }

    public void setAmount(String amount){
        this.amount = amount;
    }
    public Integer getLoadingportid(){
        return Loadingportid;
    }

    public void setLoadingportid(Integer Loadingportid){
        this.Loadingportid = Loadingportid;
    }
    public Integer getDischargeportid(){
        return dischargeportid;
    }

    public void setDischargeportid(Integer dischargeportid){
        this.dischargeportid = dischargeportid;
    }
    public Integer getNotifyingbankid(){
        return notifyingbankid;
    }

    public void setNotifyingbankid(Integer notifyingbankid){
        this.notifyingbankid = notifyingbankid;
    }
    public Date getPaymenterm(){
        return paymenterm;
    }

    public void setPaymenterm(Date paymenterm){
        this.paymenterm = paymenterm;
    }
    public Date getDeliveryterm(){
        return deliveryterm;
    }

    public void setDeliveryterm(Date deliveryterm){
        this.deliveryterm = deliveryterm;
    }
    public Date getOpentime(){
        return opentime;
    }

    public void setOpentime(Date opentime){
        this.opentime = opentime;
    }
    public String getExpirationadr(){
        return expirationadr;
    }

    public void setExpirationadr(String expirationadr){
        this.expirationadr = expirationadr;
    }
    public Integer getPackagingid(){
        return packagingid;
    }

    public void setPackagingid(Integer packagingid){
        this.packagingid = packagingid;
    }
    public Integer getCountriesid(){
        return countriesid;
    }

    public void setCountriesid(Integer countriesid){
        this.countriesid = countriesid;
    }
    public Integer getTransfer(){
        return transfer;
    }

    public void setTransfer(Integer transfer){
        this.transfer = transfer;
    }
    public Integer getSplit(){
        return split;
    }

    public void setSplit(Integer split){
        this.split = split;
    }

   
}
