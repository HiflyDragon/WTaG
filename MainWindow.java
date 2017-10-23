import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseAdapter;

public class MainWindow {

	protected Shell shlWipeTreeAnd;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlWipeTreeAnd.open();
		shlWipeTreeAnd.layout();
		while (!shlWipeTreeAnd.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlWipeTreeAnd = new Shell();
		shlWipeTreeAnd.setSize(374, 134);
		shlWipeTreeAnd.setText("Wipe Tree and Grass");
		shlWipeTreeAnd.setLayout(null);

		Label lbl = new Label(shlWipeTreeAnd, SWT.NONE);
		lbl.setBounds(150, 35, 61, 17);

		Button button = new Button(shlWipeTreeAnd, SWT.NONE);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				Wipe.WipeGrass();
				lbl.setText("已除草");
			}
		});
		button.setBounds(10, 58, 80, 27);
		button.setText("\u6E05\u9664\u8349");

		Button button_1 = new Button(shlWipeTreeAnd, SWT.NONE);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				Wipe.WipeTree();
				lbl.setText("已除树");
			}
		});
		button_1.setText("\u6E05\u9664\u6811");
		button_1.setBounds(96, 58, 80, 27);

		Button button_2 = new Button(shlWipeTreeAnd, SWT.NONE);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				Wipe.WipeTaG();
				lbl.setText("已除草和树");
			}
		});
		button_2.setText("\u6E05\u9664\u8349\u548C\u6811");
		button_2.setBounds(182, 58, 80, 27);

		Button button_3 = new Button(shlWipeTreeAnd, SWT.NONE);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				Wipe.Recover();
				lbl.setText("已还原");
			}
		});
		button_3.setText("\u8FD8\u539F");
		button_3.setBounds(268, 58, 80, 27);

		Label lblpubg = new Label(shlWipeTreeAnd, SWT.NONE);
		lblpubg.setBounds(81, 10, 199, 27);
		lblpubg.setText("\u6CE8\u610F\uFF1A\u8BF7\u5728\u542F\u52A8PUBG\u524D\u4F7F\u7528\u672C\u7A0B\u5E8F");

	}
}
