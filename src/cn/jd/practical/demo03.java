package cn.jd.practical;

public class demo03 {
	public static void main(String[] args) {
		Id c1=new Id();
		c1.setId("320926195511175276");
		System.out.println("判身份证号是否合法："+c1.IsID());
		System.out.println("判身份证号规则是否合法："+c1.CheckID());
		System.out.println("判城市代码是否合法："+c1.CheckCityCode());
		System.out.println("判日期是否合法："+c1.CheckDate());
		System.out.println("判日期："+Id.CheckDate(2061, 6, 29));
		System.out.println("判闰年："+Id.IsLeapYear(2015));
		System.out.println("返回某年某月的天数："+Id.DaysOfMonth(2074, 1));
	}
 static class Id {
	private String id;
	private  static String[][] codeAndCity = {  
									{ "11", "北京" }, { "12", "天津" }, 
                                    { "13", "河北" }, { "14", "山西" }, 
                                    { "15", "内蒙古" }, { "21", "辽宁" },  
                                    { "22", "吉林" }, { "23", "黑龙江" }, 
                                    { "31", "上海" }, { "32", "江苏" }, 
                                    { "33", "浙江" }, { "34", "安徽" }, 
                                    { "35", "福建" }, { "36", "江西" }, 
                                    { "37", "山东" }, { "41", "河南" }, 
                                    { "42", "湖北" }, { "43", "湖南" }, 
                                    { "44", "广东" }, { "45", "广西" }, 
                                    { "46", "海南" }, { "50", "重庆" }, 
                                    { "51", "四川" }, { "52", "贵州" }, 
                                    { "53", "云南" }, { "54", "西藏" }, 
                                    { "61", "陕西" }, { "62", "甘肃" }, 
                                    { "63", "青海" }, { "64", "宁夏" },  
                                    { "65", "新疆" }, { "71", "台湾" }, 
                                    { "81", "香港" }, { "82", "澳门" }, 
                                    { "91", "国外" } 
                                };
	public void ID(String id) {
        this.id = id;
   }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public boolean IsID() { // 判身份证号是否合法
        return CheckCityCode() && CheckID() && CheckDate();
   }
	
   private boolean CheckCityCode() { // 判城市代码是否合法
	   for(int i=0;i<codeAndCity.length-1;i++){
		   String str=id.substring(0, 2);
		   if(codeAndCity[i][0].indexOf(str)!=-1){
			   return true;
		   }
	   }
	   return false;
   }
   
   private boolean CheckID() {     // 判身份证号规则是否合法
	   if(id.length()==18)
		   return true;
	   else
		   return false;
   }
   private boolean CheckDate() { 	// 判日期是否合法
	   String n = id.substring(6, 10);
	   String y = id.substring(10, 12);
	   String r = id.substring(12, 14);
	   int n1=Integer.valueOf(n).intValue();
	   int y1=Integer.valueOf(y).intValue();
	   int r1=Integer.valueOf(r).intValue();
	   if(n1>1900&&(y1>1&&y1<12)&&(r1<31&&r1>1))
		   return true;
	   else
		   return false;
   }
   // 判日期
   private static boolean CheckDate(int year, int month, int day) {
		if(year<1900)
			return false;
		if(month<1||month>12)
			return false;
		if(day<1||day>31)
			return false;
		else
			return true;
   }
    // 判闰年
  	private static boolean IsLeapYear(int year) {
  		if(year%4==0&&year%100!=0)
  			return true;
  		else
  			return false;
  	} 
// 返回某年某月的天数
  	private static int DaysOfMonth(int year, int month) {
  		int days = 0;
  		if (month != 2) {
  		    switch (month) {
  		    case 1:
  		    case 3:
  		    case 5:
  		    case 7:
  		    case 8:
  		    case 10:
  		    case 12:
  			days = 31;
  			break;
  		    case 4:
  		    case 6:
  		    case 9:
  		    case 11:
  			days = 30;

  		    }
  		} else {
  		    //闰年
  		    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
  			days = 29;
  		    else
  			days = 28;
  		}
  		return days;
  	}	
}
}
