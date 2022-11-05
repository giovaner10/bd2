module br.com.cesed.si.bd2.bd2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;
    requires postgresql;


    opens br.com.cesed.si.bd2.bd2 to javafx.fxml;
    exports br.com.cesed.si.bd2.bd2;
}