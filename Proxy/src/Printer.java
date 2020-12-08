
public class Printer implements Printable{
	private String name;
	public Printer() {
		heavyjob("Printerインスタンスを生成中");
	}

	public Printer(String name) {
		this.name = name;
		heavyjob("Printerインスタンス" + name + "を生成中");
	}

	public void setPrinterName(String name) {
		this.name = name;
	}

	public String getPrinterName() {
		return name;
	}

	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}

	private void heavyjob(String msg) {
		System.out.println(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.print(".");
		}
		System.out.println("完了");
	}
}
