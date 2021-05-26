package com.example.denemeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class OrtayaKarisik extends AppCompatActivity {
    AlertDialog.Builder builder;
    private Button checkBox;
    private android.widget.TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortaya_karisik);

        ImageView geriİmg = (ImageView) findViewById(R.id.geri);
        {
            geriİmg.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(OrtayaKarisik.this, MainActivity.class);
                    OrtayaKarisik.this.startActivity(intent);
                }

            });
            builder = new AlertDialog.Builder(this);
            checkBox = (Button) findViewById(R.id.checkBox);
            checkBox.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    builder.setMessage("Ticari hacmin gelişmesi ve piyasada yeni aktörlerin faal hale gelmesi gerek tüzel gerek ise gerçek kişiler arasındaki ilişkilerin daha kapsamlı ve çetrefilli hale gelmesine sebebiyet vermiştir. Ticari işlerin devamlılığına istinaden, bu ticari ilişkilerin tarafları ticari hayatın bir gerekliliği olarak kendilerine ait en küçüğünden en önemlisine kadar şirketin en önemli değerlerinden olan ticari sırları ve bilgileri paylaşmak durumundadırlar. Ancak yüksek işletmesel öneme haiz ticari sırların herhangi bir koruma yoluna başvurmaksızın başkaca bir kişiye ifşa edilmesi düşünülemez. Gizli bilgi olarak nitelendirilen bu bilgi ve belgelerin korunması ve üçüncü kişiler ile paylaşılmasını engellemek amacıyla, yaygın olarak taraflar arasında Gizlilik Sözleşmesi imzalanmaktadır. Bu makalede ise gizlilik sözleşmesinin uygulamada ne şekilde karşımıza çıkabileceği ve gizlilik sözleşmelerinde dikkat çeken unsurlar açıklanıyor olacaktır.")
                            .setCancelable(false)
                            .setPositiveButton("Onaylıyorum", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    closeOptionsMenu();
                                    dialog.cancel();
                                    Toast.makeText(getApplicationContext(), "Onaylandı",
                                            Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setNegativeButton("Onaylamıyorum", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Toast.makeText(getApplicationContext(), "Onaylanmadı",
                                            Toast.LENGTH_SHORT).show();
                                }
                            });
                    //Creating dialog box
                    AlertDialog alert = builder.create();
                    //Setting the title manually
                    alert.setTitle("Uyarı ⚠️");
                    alert.show();
                }
            });
        }
    }
}