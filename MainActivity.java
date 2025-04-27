public class MainActivity extends AppCompatActivity {

    EditText name;
    Button click;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etNameGE2);
        click = findViewById(R.id.btnClickGE2);
        showResult();
    }

    public void showResult(){
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredName = name.getText().toString().trim();

                if (!enteredName.isEmpty()) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.custom_toast_layout, null);
                    toast = Toast.makeText(getApplicationContext(),
                            "Hello " + enteredName + "!\nWelcome to Android Development!",
                            Toast.LENGTH_SHORT);

                    View toastView = toast.getView();
                    toastView.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);

                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();

                }else {
                    Toast.makeText(getApplicationContext(), "Please enter your name", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
