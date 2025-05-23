class Student{
 private String name;
 private String gender;
 private String dob;
 private String branch;
 private int year;
 public String bloodgrp;
  Student(String name,String gender,String dob,String branch, int year,String bloodgrp)
  {
    this.name=name;
    this.gender=gender;
    this.dob=dob;
    this.branch=branch;
    this.year=year;
    this.bloodgrp=bloodgrp;
  }
  public String getname()
  {
    return name;
  }
  public String getgender()
  {
    return gender;
  }
  public String getdob()
  {
    return dob;
  }
  public String getbranch()
  {
    return branch;
  }
  public void setbranch(String branch)
  {
    this.branch=branch;
  }  
  public int getyear()
  {
    return year;
  }
  
}
class Regular_student extends Student{
   static int count;
   String registration_no;
   Regular_student(String name,String gender,String dob,String branch, int year,String bloodgrp) 
   {
     super(name,gender,dob,branch,year,bloodgrp);
     count++;
     this.registration_no=generateRegNo();
   }
   String generateRegNo(){
     return getyear()+"B"+getbranch().toUpperCase().substring(0,2)+String.format("%03d",count);
    }
    public String toString(){
     return "Name:"+getname()+"\nGender:"+getgender()+"\nDOB:"+getdob()+"\nBranch:"+getbranch()+"\nYear:"+getyear()+"\nBloodgrp:"+bloodgrp+"\nRegistration No. :"+registration_no;
     }
}
class DSY_student extends Student{
   static int count=500;
   String registration_no;
   DSY_student(String name,String gender,String dob,String branch, int year,String bloodgrp) 
   {
     super(name,gender,dob,branch,year,bloodgrp);
     count++;
     this.registration_no=generateRegNo();
   }
   String generateRegNo(){
     return getyear()+"B"+getbranch().toUpperCase().substring(0,2)+String.format("%03d",count);
    }
    public String toString(){
     return "Name:"+getname()+"\nGender:"+getgender()+"\nDOB:"+getdob()+"\nBranch:"+getbranch()+"\nYear:"+getyear()+"\nBloodgrp:"+bloodgrp+"\nRegistration No. :"+registration_no;
     }
}
class SMS{
  public static void main(String args[])
  {
    Regular_student rs=new Regular_student("Alia Gupta","Female","04-01-2005","CSE",2023,"O+");
    System.out.println(rs);
    System.out.println("-----------------------------------------");
    Regular_student rs1=new Regular_student("Deepika kapoor","Female","21-06-2004","IT",2023,"O+");
    System.out.println(rs1);
    System.out.println("-----------------------------------------");
    DSY_student dsy=new DSY_student("Manish mehta","Male","12-05-2004","extc",2024,"B+");
    System.out.println(dsy);
  }
}  
    
