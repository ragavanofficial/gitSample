package org.company;

public class CompanyInfo {
   private void companyName(char Nokia, char Samsung, char Apple) {
	   System.out.println(Nokia);
	   System.out.println(Samsung);
	   System.out.println(Apple);
}
   public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
    c.companyName('N', 'S', 'A');
}
}
