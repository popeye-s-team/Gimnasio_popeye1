import java.util.*;

public class Main{
    public static void main(String args[]){
        //director
        Date fecha1 = new GregorianCalendar(1978, Calendar.FEBRUARY, 11).getTime();
        Empleado e1 = new Empleado("37087726L", "Carmen Fuentes Aranda", fecha1, 82000, "617922845", UUID.randomUUID(), "Director", "carmenfu", "carmen1234");

        //limpiadores
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

        //monitores
        Date fecha7 = new GregorianCalendar(1996, Calendar.MAY, 22).getTime();
        Monitor e7 = new Monitor("76025665Q", "Iole Porras Miramontes", fecha7, 28000, "619533386", UUID.randomUUID(), "Monitor", "iole_porras", "iole22");

        Date fecha8 = new GregorianCalendar(1997, Calendar.AUGUST, 30).getTime();
        Monitor e8 = new Monitor("69568113A", "Belmiro Sandoval Gracia", fecha8, 28000, "772469003", UUID.randomUUID(), "Monitor", "belmiro_sand", "bel34");

        Date fecha9 = new GregorianCalendar(1992, Calendar.APRIL, 25).getTime();
        Monitor e9 = new Monitor("960877677", "Lena Ochoa Heredia", fecha9, 29000, "613234960", UUID.randomUUID(), "Monitor", "lena_ochoa", "lena45");

        Date fecha10 = new GregorianCalendar(1988, Calendar.MARCH, 14).getTime();
        Monitor e10 = new Monitor("351628626", "Ian Valentín Fonseca", fecha10, 28000, "735866198", UUID.randomUUID(), "Monitor", "ian_valen", "ian98");

        Date fecha11 = new GregorianCalendar(2001, Calendar.JANUARY, 17).getTime();
        Monitor e11 = new Monitor("38270261D", "Walda Laboy Salazar", fecha11, 28000, "737629858", UUID.randomUUID(), "Monitor", "walda_laboy", "walda01");

        //entrenadores
        Date fecha12 = new GregorianCalendar(1995, Calendar.NOVEMBER, 18).getTime();
        Entrenador e12 =new Entrenador("24986297V", "Monica Prado Oliva", fecha12, 35000, "783892153", UUID.randomUUID(), "Entrenador", "monica_59", "monica_59", 0, 8);
        
        Date fecha13 = new GregorianCalendar(1982, Calendar.FEBRUARY, 19).getTime();
        Entrenador e13 =new Entrenador("43795340M", "Ines Olmo Mohamed", fecha13, 35000, "678864918", UUID.randomUUID(), "Entrenador", "ines_01", "ines_01", 0, 8);

        Date fecha14 = new GregorianCalendar(1992, Calendar.MAY, 12).getTime();
        Entrenador e14 =new Entrenador("50781021B", "Juan Carlos Mateos Araujo", fecha14, 35000, "718204635", UUID.randomUUID(), "Entrenador", "juancarlos_82", "juancarlos_82", 0, 8);

        Date fecha15 = new GregorianCalendar(1990, Calendar.SEPTEMBER, 21).getTime();
        Entrenador e15 =new Entrenador("19735128R", "Gisela Romero Fraile", fecha15, 35000, "723497090", UUID.randomUUID(), "Entrenador", "gisela_84", "gisela_84", 0, 8);

        Date fecha16 = new GregorianCalendar(1976, Calendar.OCTOBER, 27).getTime();
        Entrenador e16 =new Entrenador("61916169P", "Victor Morcillo Alfaro", fecha16, 35000, "685468867", UUID.randomUUID(), "Entrenador", "victor_86", "victor_86", 0, 8);

        //recepcionistas
        Date fecha17 = new GregorianCalendar(1976, Calendar.SEPTEMBER, 10).getTime();
        Empleado e17 =new Empleado("82447655T", "Zoraida Montoya Cabrera", fecha17, 40000, "732843256", UUID.randomUUID(), "Recepcionista", "zoraida_78", "zoraida78");
        
        Date fecha18 = new GregorianCalendar(1982, Calendar.JULY, 27).getTime();
        Empleado e18 =new Empleado("24986297V", "Jezebel Juárez Jimínez", fecha18, 40000, "771679792", UUID.randomUUID(), "Recepcionista", "jezebel_2", "jezebel_2");
        
        //socios
        Socio s1 = new Socio("Pedrito1","p123","Pedro Garcia Lopez", "669785213", "pedro.g@gmail.com", "ES26387282", UUID.randomUUID());
        Socio s2 = new Socio("Lorena1","l123", "Lorena Villaespesa Santo", "473892099","lorena@gmail.com", "ES73845890", UUID.randomUUID());
        Socio s3 = new Socio("Carlos1","c123", "Carlos Cifuentes Garcia", "521487965","carlos@gmail.com", "ES36527871", UUID.randomUUID());        
        Socio s4 = new Socio("Belen1","b123", "Belen Martos Moral", "653214987","belen@gmail.com", "ES56321489", UUID.randomUUID());
        Socio s5 = new Socio("Champi1","ch123", "Sergio Onita", "987452167","champi@gmail.com", "ES58961709", UUID.randomUUID());
        Socio s6 = new Socio("Paula1","pau123", "Paula Prieto Martinez", "548796301","paula@gmail.com", "ES78930123", UUID.randomUUID());
        Socio s7 = new Socio("Gonzalo1","gon123", "Gonzalo Lopez Torremolinos", "789541204","gonzalo@gmail.com", "ES56521876", UUID.randomUUID());

        //actividades
        Actividad cardio = new Actividad(UUID.randomUUID(), "cardio", "18:00 - 19:00", 15, "sala_cardio");
        Actividad piscina = new Actividad(UUID.randomUUID(), "piscina", "13:00 - 14:00", 22, "sala_piscina");
        Actividad fuerza = new Actividad(UUID.randomUUID(), "fuerza", "15:30 - 16:30", 20, "zona_fuerza");
        Actividad fitness = new Actividad(UUID.randomUUID(), "fitness", "12:00 - 13:00", 40, "sala_fitness");
        Actividad zumba = new Actividad(UUID.randomUUID(), "zumba", "08:00 - 09:00", 10, "sala_zumba");

        //servicios adicionales
        Servicios_adicionales jacuzzi = new Servicios_adicionales(UUID.randomUUID(), "jacuzzi");
        Servicios_adicionales spa = new Servicios_adicionales(UUID.randomUUID(), "spa");
        Servicios_adicionales sauna = new Servicios_adicionales(UUID.randomUUID(), "sauna");
        Servicios_adicionales masaje = new Servicios_adicionales(UUID.randomUUID(), "masaje");
        
        //alta empleados y socios
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
        Util.altaSocio(s6);
        Util.altaSocio(s7);
        Util.altaEmpleado(e5);
        Util.altaEmpleado(e6);
        Util.altaEmpleado(e7);
        Util.altaEmpleado(e8);
        Util.altaEmpleado(e9);
        Util.altaEmpleado(e10);
        Util.altaEmpleado(e11);
        Util.altaEmpleado(e12);
        Util.altaEmpleado(e13);
        Util.altaEmpleado(e14);
        Util.altaEmpleado(e15);
        Util.altaEmpleado(e16);
        Util.altaEmpleado(e17);
        Util.altaEmpleado(e18);
        Util.registrar_actividad(cardio);
        Util.registrar_actividad(piscina);
        Util.registrar_actividad(fuerza);
        Util.registrar_actividad(fitness);
        Util.registrar_actividad(zumba);
        Util.registrar_Servicios_adicionales(jacuzzi);
        Util.registrar_Servicios_adicionales(spa);
        Util.registrar_Servicios_adicionales(sauna);
        Util.registrar_Servicios_adicionales(masaje);
    }
}