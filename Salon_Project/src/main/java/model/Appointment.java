package model;

public class Appointment {

 private int id;
 private int userId;
 private int salonId;
 private String therapist;
 private String service;
 private String date;
 private String time;
 private String status;

 public int getId(){ return id; }
 public void setId(int id){ this.id=id; }

 public int getUserId(){ return userId; }
 public void setUserId(int userId){ this.userId=userId; }

 public String getTherapist(){ return therapist; }
 public void setTherapist(String therapist){ this.therapist=therapist; }

 public String getService(){ return service; }
 public void setService(String service){ this.service=service; }

 public String getDate(){ return date; }
 public void setDate(String date){ this.date=date; }

 public String getTime(){ return time; }
 public void setTime(String time){ this.time=time; }

 public String getStatus(){ return status; }
 public void setStatus(String status){ this.status=status; }
}
