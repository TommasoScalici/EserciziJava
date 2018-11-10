package biblioteca;

public abstract class Documento {

    private static int progressivo;

    protected String id;

    
    public Documento() {
        id = String.valueOf(++progressivo);
    }

    public Class<?> getInfo() {
        return getClass();
    }


    @Override
    public String toString() {
        return "ID:" + id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Documento))
            return false;

        Documento d = (Documento)obj;

        if(this.id != d.id)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}