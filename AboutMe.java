public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los siguentes datos:
        // nombre, edad, país, lenguaje de programación, horas, pasatiempo, lugar y reemplaza
        // en el texto de impresión, la variable que corresponda.

        String name = "Mary";
        byte age = 48;
        String country = "Irlanda";
        String progLang = "java";
        byte numHours = 5;
        String hobby = "ir en bici";
        String hobbyPlace = "el campo";


        //Escribe tu código aquí

        //Reemplaza <name> y <age> concatenando el String con las variables creadas. 
        System.out.println("Mi nombre es " + name + ", tengo " + age + " años y soy de " + country + ".");

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println("Estoy estudiando " + progLang + " y practico " + numHours + " horas al día.");

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println("Mi pasatiempo favorito es " + hobby + " y lo practico en " + hobbyPlace);
    }
}
