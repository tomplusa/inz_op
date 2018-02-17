
public class Singleton {

        private static Singleton instancja = null;

    private Singleton() {

        }
    public static Singleton getInstancja() {
           if (instancja == null)
                instancja = new Singleton();
            return instancja;
        }
    }

