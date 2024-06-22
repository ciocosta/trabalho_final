import java.util.ArrayList;
import java.util.List;

public class MeuCatalogo{
    private static List<Catalogo> listaCatalogo = new ArrayList<>();

    public static void adicionar(Catalogo cat){
        listaCatalogo.add(cat);
    }

    public static List<Catalogo> getListaCatalogo(){
        return listaCatalogo;
    }
}