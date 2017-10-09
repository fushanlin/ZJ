package com.another.Goods.entity;

import java.util.Date;
/**
 * 
 */
public class Goods {

    private Integer ID;      //
    private Integer PID;      //上级来源
    private Integer NormsId;      //
    private String Number;      //数量
    private String Weight;      //重量
    private Integer UserId;      //货权人ID
    private Integer SourceId;      //来源ID
    private String Packing;      //包装
    private Date Bothday;      //创建日期
    private Integer State;      //状态
    private String Price;      //单价
    private Integer ValueMethod;      //单价计量方式
    private String Cost;      //成本
    private String CostMethod;      //成本计量方式
    private String FirstCost;      //初始成本
    private String LossNum;      //盈亏数量
    private String LossWght;      //盈亏重量
    private Integer SeatId;      //


    public Goods(){

    }

    public Integer getID(){
        return ID;
    }

    public void setID(Integer ID){
        this.ID = ID;
    }
    public Integer getPID(){
        return PID;
    }

    public void setPID(Integer PID){
        this.PID = PID;
    }
    public Integer getNormsId(){
        return NormsId;
    }

    public void setNormsId(Integer NormsId){
        this.NormsId = NormsId;
    }
    public String getNumber(){
        return Number;
    }

    public void setNumber(String Number){
        this.Number = Number;
    }
    public String getWeight(){
        return Weight;
    }

    public void setWeight(String Weight){
        this.Weight = Weight;
    }
    public Integer getUserId(){
        return UserId;
    }

    public void setUserId(Integer UserId){
        this.UserId = UserId;
    }
    public Integer getSourceId(){
        return SourceId;
    }

    public void setSourceId(Integer SourceId){
        this.SourceId = SourceId;
    }
    public String getPacking(){
        return Packing;
    }

    public void setPacking(String Packing){
        this.Packing = Packing;
    }
    public Date getBothday(){
        return Bothday;
    }

    public void setBothday(Date Bothday){
        this.Bothday = Bothday;
    }
    public Integer getState(){
        return State;
    }

    public void setState(Integer State){
        this.State = State;
    }
    public String getPrice(){
        return Price;
    }

    public void setPrice(String Price){
        this.Price = Price;
    }
    public Integer getValueMethod(){
        return ValueMethod;
    }

    public void setValueMethod(Integer ValueMethod){
        this.ValueMethod = ValueMethod;
    }
    public String getCost(){
        return Cost;
    }

    public void setCost(String Cost){
        this.Cost = Cost;
    }
    public String getCostMethod(){
        return CostMethod;
    }

    public void setCostMethod(String CostMethod){
        this.CostMethod = CostMethod;
    }
    public String getFirstCost(){
        return FirstCost;
    }

    public void setFirstCost(String FirstCost){
        this.FirstCost = FirstCost;
    }
    public String getLossNum(){
        return LossNum;
    }

    public void setLossNum(String LossNum){
        this.LossNum = LossNum;
    }
    public String getLossWght(){
        return LossWght;
    }

    public void setLossWght(String LossWght){
        this.LossWght = LossWght;
    }
    public Integer getSeatId(){
        return SeatId;
    }

    public void setSeatId(Integer SeatId){
        this.SeatId = SeatId;
    }

   
}
