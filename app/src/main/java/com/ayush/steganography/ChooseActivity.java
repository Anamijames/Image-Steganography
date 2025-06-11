public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        Button encodeButton = findViewById(R.id.button_encode);
        Button decodeButton = findViewById(R.id.button_decode);

        encodeButton.setOnClickListener(view -> {
            // Navigate to Encode Activity
            Intent intent = new Intent(ChooseActivity.this, EncodeActivity.class);
            startActivity(intent);
        });

        decodeButton.setOnClickListener(view -> {
            // Navigate to Decode Activity
            Intent intent = new Intent(ChooseActivity.this, DecodeActivity.class);
            startActivity(intent);
        });
    }
}
