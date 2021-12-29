import java.time.LocalDate;
import java.util.*;

public class Main{
    public static void main(String args[]){
        Date fecha1 = new GregorianCalendar(1978, Calendar.FEBRUARY, 11).getTime();
        Empleado e1 = new Empleado("37087726L", "Carmen Fuentes Aranda", fecha1, 42000, "617922845", UUID.randomUUID(), "Director", "carmenfu", "carmen1234");

        Date fecha2 = new GregorianCalendar(1978, Calendar.FEBRUARY, 11).getTime();
        Empleado e2 = new Empleado("37087726L", "Carmen Fuentes Aranda", fecha1, 42000, "617922845", UUID.randomUUID(), "Director", "carmenfu", "carmen1234");

        Date fecha3 = new GregorianCalendar(1978, Calendar.FEBRUARY, 11).getTime();
        Empleado e3 = new Empleado("37087726L", "Carmen Fuentes Aranda", fecha1, 42000, "617922845", UUID.randomUUID(), "Director", "carmenfu", "carmen1234");

        Date fecha4 = new GregorianCalendar(1978, Calendar.FEBRUARY, 11).getTime();
        Empleado e4 = new Empleado("37087726L", "Carmen Fuentes Aranda", fecha1, 42000, "617922845", UUID.randomUUID(), "Director", "carmenfu", "carmen1234");

        Date fecha5 = new GregorianCalendar(1978, Calendar.FEBRUARY, 11).getTime();
        Empleado e5 = new Empleado("37087726L", "Carmen Fuentes Aranda", fecha1, 42000, "617922845", UUID.randomUUID(), "Director", "carmenfu", "carmen1234");

        Socio s1 = new Socio("Pedro Garcia Lopez", "669785213", "pedro.g@gmail.com", "ES26387282", UUID.randomUUID());
        Socio s2 = new Socio("Lorena Villaespesa Santo", "669785213", "pedro.g@gmail.com", "ES26387282", UUID.randomUUID());
        Socio s1 = new Socio("Pedro Garcia Lopez", "669785213", "pedro.g@gmail.com", "ES26387282", UUID.randomUUID());
        Socio s1 = new Socio("Pedro Garcia Lopez", "669785213", "pedro.g@gmail.com", "ES26387282", UUID.randomUUID());
        Socio s1 = new Socio("Pedro Garcia Lopez", "669785213", "pedro.g@gmail.com", "ES26387282", UUID.randomUUID());
    
    
    }
}