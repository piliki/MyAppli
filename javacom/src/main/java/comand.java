import java.io.IOException;

public class comand {
	
	
	public static void main(String[] args) {
		if(args[0].equals("mkdir")|args[0].equals("cls")|args[0].equals("del")|args[0].equals("rm")|args[0].equals("copy")|args[0].equals("move")|args[0].equals("help")) {
			comand cal= new comand();
			try {
				cal.execute(args);
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			help();
			System.exit(1);
		}
	}
	
	

	static void help() {
		System.out.println("help \nmkdir \ncls  \ndel \ncopy \nmove \nrm ");
	}
	

	

	
	
	Runtime runtime = Runtime.getRuntime();
	
	
	
	
	public  void execute(String[] tab) throws IOException, InterruptedException {	
		switch(tab[0]) {
		case "rm":
			if(tab.length==2) {	
				runtime.exec("cmd /c "+tab[0]+" "+tab[1]);
			}
			
		case "cls":
			if(tab.length==0) {	
				runtime.exec("cmd /c "+tab[0]);
			}
		case "copy":
			
			if(tab.length==3) {
				runtime.exec("cmd /c "+tab[0]+" "+tab[1]+" "+tab[2]);
			}
			
		case "mkdir":
			if(tab.length==2) {	
				Process process=runtime.exec("cmd /c "+tab[0]+" "+tab[1]);
				process.waitFor();
			}
			
		case "move":
			
			if(tab.length==3) {	
				runtime.exec("cmd /c "+tab[0]+" "+tab[1]+" "+tab[2]);
			}
			
		case "help":
			
			if(tab.length==0) {	
				System.out.println(runtime.exec("cmd /c "+tab[0]));
			}
			
		case "del":
			if(tab.length==2) {	
				runtime.exec("cmd /c "+tab[0]+" "+tab[1]);
			}
		}
	}
	
}

