package DDT2;

import Data_Management.Get_Dom4j;

import java.io.IOException;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Get_Dom4j get_dom4j = new Get_Dom4j("LoginEleData.xml");
        get_dom4j.getele();
        get_dom4j.close();
    }
}
