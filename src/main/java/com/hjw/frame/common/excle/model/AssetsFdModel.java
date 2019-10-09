package com.hjw.frame.common.excle.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import com.hjw.frame.common.excle.utils.CellStyleFormat;

import java.util.Date;

public class AssetsFdModel extends BaseRowModel{
//    <node id="fdName" name="设备名称" type="string"></node>
//    <node id="typeName" name="资产类型" type="string"></node>
//    <node id="depName" name="行政区域" type="string"></node>
//    <node id="userName" name="责任人" type="string"></node>
//    <node id="pileNo" name="桩号" type="string"></node>
//    <node id="serialNo" name="序列号" type="string"></node>
//    <node id="qualityDate" name="质保时间" type="date"></node>
//    <node id="buyDate" name="采购时间" type="date"></node>
//    <node id="model" name="设备型号" type="string"></node>
//    <node id="factoryName" name="设备厂商" type="string"></node>
//    <node id="installDate" name="安装时间" type="date"></node>
//    <node id="life" name="使用寿命" type="integer"></node>
//    <node id="engineer" name="工程商" type="string"></node>
//    <node id="remark" name="备注" type="string"></node>
//    <node id="ipAddress" name="IP地址" type="string"></node>
//    <node id="ipPort" name="端口号" type="integer"></node>
//    <node id="account" name="账号" type="string"></node>
//    <node id="pwd" name="密码" type="string"></node>
//    <node id="groupId" name="服务器组" type="string"></node>
//    <node id="fdId" name="设备编码" type="string"></node>
//    <node id="fdType" name="设备类型" type="string"></node>
//    <node id="videoInNum" name="通道数" type="integer"></node>
	

	@ExcelProperty(value = "设备名称" ,index =0 )
	@CellStyleFormat
	String fdName;
	@ExcelProperty(value = "资产类型" ,index =1 )
	@CellStyleFormat
	String typeName;
	@ExcelProperty(value = "行政区域" ,index =2 )
	@CellStyleFormat
	String depName;
	@ExcelProperty(value = "责任人" ,index =3 )
	@CellStyleFormat
	String userName;
	@ExcelProperty(value = "桩号" ,index =4 )
	@CellStyleFormat
	String pileNo;
	@ExcelProperty(value = "序列号" ,index =5 )
	@CellStyleFormat
	String serialNo;
	@ExcelProperty(value = "质保时间" ,index =6 )
	@CellStyleFormat
	Date qualityDate;
	@ExcelProperty(value = "采购时间" ,index =7 )
	@CellStyleFormat
	Date buyDate;
	@ExcelProperty(value = "设备型号" ,index =8 )
	@CellStyleFormat
	String model;
	@ExcelProperty(value = "设备厂商" ,index =9 )
	@CellStyleFormat
	String factoryName;
	@ExcelProperty(value = "安装时间" ,index =10 )
	@CellStyleFormat
	Date installDate;
	@ExcelProperty(value = "使用寿命" ,index =11 )
	@CellStyleFormat
	Integer life;
	@ExcelProperty(value = "工程商" ,index =12 )
	@CellStyleFormat
	String engineer;
	@ExcelProperty(value = "备注" ,index =13 )
	@CellStyleFormat
	String remark;
	@ExcelProperty(value = "IP地址" ,index =14 )
	@CellStyleFormat
	String ipAddress;
	@ExcelProperty(value = "端口号" ,index =15 )
	@CellStyleFormat
	Integer ipPort;
	@ExcelProperty(value = "账号" ,index =16 )
	@CellStyleFormat
	String account;
	@ExcelProperty(value = "密码" ,index =17 )
	@CellStyleFormat
	String pwd;
	@ExcelProperty(value = "服务器组" ,index =18 )
	@CellStyleFormat
	String groupId;
	@ExcelProperty(value = "设备编码" ,index =19 )
	@CellStyleFormat
	String fdId;
	@ExcelProperty(value = "设备类型" ,index =20 )
	@CellStyleFormat
	String fdType;
	@ExcelProperty(value = "通道数" ,index =21 )
	@CellStyleFormat
	Integer videoInNum;
//  <node id="mac" name="MAC地址" type="string"></node>
//  <node id="deviceName" name="mac名称" type="string"></node>
//  <node id="deviceTypeName" name="工业以太网设备类型" type="string"></node>
//  <node id="port" name="设备网络端口" type="integer"></node>
//  <node id="deviceIP" name="设备IP" type="string"></node>
//  <node id="netmask" name="子网掩码" type="string"></node>
//  <node id="gateway" name="缺省网管" type="string"></node>
//  <node id="version" name="程序版本号" type="string"></node>	
//	@ExcelProperty(value = "MAC地址" ,index =22 )
//	String mac;
//	@ExcelProperty(value = "mac名称" ,index =23 )
//	String deviceName;
//	@ExcelProperty(value = "工业以太网设备类型" ,index =24 )
//	String deviceTypeName;
//	@ExcelProperty(value = "设备网络端口" ,index =25 )
//	Integer port;
//	@ExcelProperty(value = "设备IP" ,index =26 )
//	String deviceIP;
//	@ExcelProperty(value = "子网掩码" ,index =27 )
//	String netmask;
//	@ExcelProperty(value = "缺省网管" ,index =28 )
//	String gateway;
//	@ExcelProperty(value = "程序版本号" ,index =29 )
//	String version;
	public String getFdName() {
		return fdName;
	}
	public void setFdName(String fdName) {
		this.fdName = fdName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPileNo() {
		return pileNo;
	}
	public void setPileNo(String pileNo) {
		this.pileNo = pileNo;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public Date getQualityDate() {
		return qualityDate;
	}
	public void setQualityDate(Date qualityDate) {
		this.qualityDate = qualityDate;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public Date getInstallDate() {
		return installDate;
	}
	public void setInstallDate(Date installDate) {
		this.installDate = installDate;
	}
	public Integer getLife() {
		return life;
	}
	public void setLife(Integer life) {
		this.life = life;
	}
	public String getEngineer() {
		return engineer;
	}
	public void setEngineer(String engineer) {
		this.engineer = engineer;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Integer getIpPort() {
		return ipPort;
	}
	public void setIpPort(Integer ipPort) {
		this.ipPort = ipPort;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getFdId() {
		return fdId;
	}
	public void setFdId(String fdId) {
		this.fdId = fdId;
	}
	public String getFdType() {
		return fdType;
	}
	public void setFdType(String fdType) {
		this.fdType = fdType;
	}
	public Integer getVideoInNum() {
		return videoInNum;
	}
	public void setVideoInNum(Integer videoInNum) {
		this.videoInNum = videoInNum;
	}
//	public String getMac() {
//		return mac;
//	}
//	public void setMac(String mac) {
//		this.mac = mac;
//	}
//	public String getDeviceName() {
//		return deviceName;
//	}
//	public void setDeviceName(String deviceName) {
//		this.deviceName = deviceName;
//	}
//	public String getDeviceTypeName() {
//		return deviceTypeName;
//	}
//	public void setDeviceTypeName(String deviceTypeName) {
//		this.deviceTypeName = deviceTypeName;
//	}
//	public Integer getPort() {
//		return port;
//	}
//	public void setPort(Integer port) {
//		this.port = port;
//	}
//	public String getDeviceIP() {
//		return deviceIP;
//	}
//	public void setDeviceIP(String deviceIP) {
//		this.deviceIP = deviceIP;
//	}
//	public String getNetmask() {
//		return netmask;
//	}
//	public void setNetmask(String netmask) {
//		this.netmask = netmask;
//	}
//	public String getGateway() {
//		return gateway;
//	}
//	public void setGateway(String gateway) {
//		this.gateway = gateway;
//	}
//	public String getVersion() {
//		return version;
//	}
//	public void setVersion(String version) {
//		this.version = version;
//	}

}
