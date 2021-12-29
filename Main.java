import java.util.*;

public class Main{
    public static void main(String args[]){
        Date fecha1 = new GregorianCalendar(1978, Calendar.FEBRUARY, 11).getTime();
        Empleado e1 = new Empleado("37087726L", "Carmen Fuentes Aranda", fecha1, 82000, "617922845", UUID.randomUUID(), "Director", "carmenfu", "carmen1234");

        Date fecha2 = new GregorianCalendar(1985, Calendar.OCTOBER, 18).getTime();
        Empleado e2 = new Empleado("27073914Q", "Antoni Pastor Carbonell", fecha2, 37000, "693655322", UUID.randomUUID(), "Limpiador", "antoniop", "antoniop18");

        Date fecha3 = new GregorianCalendar(2000, Calendar.JUNE, 2).getTime();
        Empleado e3 = new Empleado("13082948L", "Emilio Alba Cobos", fecha3, 55000, "703195309", UUID.randomUUID(), "Limpiador", "emilio_02", "emilio_0200");

        Date fecha4 = new GregorianCalendar(1994, Calendar.JANUARY, 30).getTime();
        Empleado e4 = new Empleado("14989130F", "Purificacion Zamora Brito", fecha4, 42000, "633184063", UUID.randomUUID(), "Limpiador", "puri_zamora", "purificada1122");

        Date fecha5 = new GregorianCalendar(1985, Calendar.MAY, 23).getTime();
        Empleado e5 = new Empleado("33998409Q", "Leticia Chen Guijarro", fecha5, 33000, "682166312", UUID.randomUUID(), "Limpiador", "leticia_guijarro", "atleti23");

        Date fecha6 = new GregorianCalendar(2001, Calendar.DECEMBER, 15).getTime();
        Empleado e6 = new Empleado("47388209K", "Claudia Ballesteros Tirado", fecha6, 35000, "755596056", UUID.randomUUID(), "Limpiador", "claudia_ball", "pelotas");

        Date fecha6 = new GregorianCalendar(1996, Calendar.DECEMBER, 15).getTime();
        Empleado e6 = new Empleado("68925689", "Iole Porras Miramontes", fecha5, 2800, "619 533 386", UUID.randomUUID(), "Monitor", "iole_porras", "iole22");

        Date fecha6 = new GregorianCalendar(1998, Calendar.DECEMBER, 15).getTime();
        Empleado e6 = new Empleado("68925689", "Iole Porras Miramontes", fecha5, 2800, "619 533 386", UUID.randomUUID(), "Monitor", "iole_porras", "iole22");

        Socio s1 = new Socio("Pedrito1","p123","Pedro Garcia Lopez", "669785213", "pedro.g@gmail.com", "ES26387282", UUID.randomUUID());
        Socio s2 = new Socio("Lorena1","l123", "Lorena Villaespesa Santo", "473892099","lorena@gmail.com", "ES73845890", UUID.randomUUID());
        Socio s3 = new Socio("Carlos1","c123", "Carlos Cifuentes Garcia", "521487965","carlos@gmail.com", "ES36527871", UUID.randomUUID());        
        Socio s4 = new Socio("Belen1","b123", "Belen Martos Moral", "653214987","belen@gmail.com", "ES56321489", UUID.randomUUID());
        Socio s5 = new Socio("Champi1","ch123", "Sergio Onita", "987452167","champi@gmail.com", "ES58961709", UUID.randomUUID());

        Actividad cardio = new Actividad(UUID.randomUUID(), "cardio", "18:00 - 19:00", "15", "sala_cardio");
        Actividad piscina = new Actividad(UUID.randomUUID(), "piscina", "13:00 - 14:00", "22", "sala_piscina");
        Actividad fuerza = new Actividad(UUID.randomUUID(), "fuerza", "15:30 - 16:30", "20", "zona_fuerza");
        Actividad fitness = new Actividad(UUID.randomUUID(), "fitness", "12:00 - 13:00", "40", "sala_fitness");
        Actividad zumba = new Actividad(UUID.randomUUID(), "zumba", "08:00 - 09:00", "10", "sala_zumba");
        
        Util.altaEmpleado(e1);
        Util.altaSocio(s1);
        Util.altaEmpleado(e2);
        Util.altaSocio(s2);
        Util.altaEmpleado(e3);
        Util.altaSocio(s3);
        Util.altaEmpleado(e4);
        Util.altaSocio(s4);
        Util.altaEmpleado(e5);
        Util.altaSocio(s5);

        Servicios_adicionales jacuzzi = new Servicios_adicionales(UUID.randomUUID(), "jacuzzi");
        Servicios_adicionales spa = new Servicios_adicionales(UUID.randomUUID(), "spa");
        Servicios_adicionales sauna = new Servicios_adicionales(UUID.randomUUID(), "sauna");
        Servicios_adicionales masaje = new Servicios_adicionales(UUID.randomUUID(), "masaje");

        Entrenador entrenador1 =new Entrenador(dni, nombre, fecha_nacimiento, salario, telefono, id, tipo_empleado, usuario, contrasena, n_horas_reservadas, n_horas_libres);
        

        Monitor monitor1 = new Monitor ()
        Monitor monitor2
        Monitor monitor3
    }
}