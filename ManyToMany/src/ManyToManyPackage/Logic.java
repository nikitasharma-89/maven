package ManyToManyPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession(); 
/*	-------------------------------------------------------Insert / save query-----------------------------------------------------------------------------
		 Teacher t=new Teacher();
		 t.settId(3);
		 t.settName("anita");
		 t.settSalary(50000);
		 
		 Teacher t1=new Teacher();
		 t1.settId(4);
		 t1.settName("arun");
		 t1.settSalary(50000);
		 
		 Student s=new Student();
		 s.setsId(1);
		 s.setsName("srirang");
		 s.setsSalary(100000);
		 
		 Student  s1=new Student();
		 s1.setsId(2);
		 s1.setsName("somu");
		 s1.setsSalary(500000);
		 
		 Set set=new HashSet();
		 set.add(s);
		 set.add(s1);
		 
		 t.setStudentchildren(set);
		 t1.setStudentchildren(set);
		   /*    session.save(t);
         session.save(t1);
	-------------------------------------------------------------------------------------------------------------------------	 
		 																		
		 															/*	update 
		 																
		 	Teacher t=(Teacher)session.get(Teacher.class, 1);
		 	Set set=t.getStudentchildren();
		 	
		 	Iterator it=set. iterator();
		 	
		 	while(it.hasNext())
		 	{
		 		Student s1=(Student) it.next();
		 		s1.setsName("anu");	
		 	 	session.update(s1);
		 	}
		 	----------------------------------------------------------------------------------------------------------------------------
		 	
		 Student s=(Student)session.get(Student.class, 1);
		 Set set=s.getTeacherchildren();
		 
		 Iterator it=set.iterator();
		 while(it.hasNext())
		 {
			 	Teacher t=(Teacher)it.next();
			 	t.settName("melissa");
			 	session.update(t);
		 }
	--------------------------------------------------------------------------------------------------------------------------------------------
		 																			delete***********
	/*	 Teacher t=(Teacher)session.get(Teacher.class, 2);
		 session.delete(t);
		 
		 
		 Student s=(Student)session.get(Student.class, 1);
		 session.delete(s);

------------------------------------------------------------------------------------------------------------------------------------------*/
		 																					/*	get*/
		 																						
		  Student s=(Student)session.get(Student.class, 2);
		 	 Set set=s.getTeacherchildren();
		 	
		 	 Iterator it=set.iterator();
			 while(it.hasNext())
			 {
				 	Teacher t=(Teacher)it.next();
				System.out.println(t.gettName());
				System.out.println(t.gettSalary());
	}
			 
			 /*Teacher t=(Teacher)session.get(Teacher.class, 3);
			 Set set=t.getStudentchildren();
			 
			 Iterator it=set.iterator();
			 while(it.hasNext())
			 {
				 Student s=(Student)it.next();
				 System.out.println(s.getsSalary());
			 }*/
		 	 
				 
		 Transaction tx = session.beginTransaction();
        tx.commit();

			session.close();
			System.out.println("Many To Many Bi-Directional is Done..!!");
			factory.close();
}
}