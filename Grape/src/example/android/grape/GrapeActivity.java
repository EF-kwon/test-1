package example.android.grape;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GrapeActivity extends Activity {

	// onCreate���\�b�h(��ʏ����\���C�x���g�n���h��)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// �X�[�p�[�N���X��onCreate���\�b�h�Ăяo��
		super.onCreate(savedInstanceState);
		// ���C�A�E�g�ݒ�t�@�C���̎w��
		setContentView(R.layout.activity_grape);

		// URI�擾
		Uri uri = getIntent().getData();
		if(uri!=null){
			// URI��QueryString���擾
			String fruitname = uri.getQueryParameter("selecteditem");
			// TextView�I�u�W�F�N�g�擾
			TextView furittext = (TextView)findViewById(R.id.tv_fruit);
			// �ʕ��̖��O�\��
			furittext.setText(fruitname);
		}

		// �{�^���I�u�W�F�N�g�I�u�W�F�N�g�擾
		Button button = (Button)findViewById(R.id.bt_back);
		// �{�^���I�u�W�F�N�g�ɃN���b�N���X�i�[�ݒ�
		button.setOnClickListener(new ButtonClickListener());
	}
	
	// �N���b�N���X�i�[��`
	class ButtonClickListener implements OnClickListener {
		// onClick���\�b�h(�{�^���N���b�N���C�x���g�n���h��)
		public void onClick(View v) {
			// �A�N�e�B�r�e�B�I��(��ʃN���[�Y)
			finish();
		}
	}

	// onCreateOptionsMenu���\�b�h(�I�v�V�������j���[����)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // �I�v�V�������j���[��ݒ�
		getMenuInflater().inflate(R.menu.grape, menu);
		return true;
	}

}