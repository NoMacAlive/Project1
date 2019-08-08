import Parser.DotFileParser;

public class InputHandler
{ 
	private String file;
	private String numberOfProcessors;

//	Optional argument
	private String numberOfCores;
	private Boolean visualise = false;
	private String outputFileName = "INPUT-output.dot";
		public InputHandler(String[] args){
			this.file = args[0];
			this.numberOfProcessors = args[1];
			String temp;

			for(int i=2; i < args.length;i++){
				temp = args[i];
				if(temp.equals("-p")){
					this.numberOfCores = args[i+1];
//					i++;
				}else if(temp.equals("-v")){
					this.visualise = true;
//					i++;
				}else if(temp.equals("-o")){
					this.outputFileName = args[i+1];
//					i++;
				}
			}
			try{
				DotFileParser parser = new DotFileParser();
			}catch(Exception e){

			}

			

			System.out.println("the input file name is: "+this.file);
			System.out.println("The number of processor specified is:"+this.numberOfProcessors);
			System.out.println("The nuberOfCore is: "+ this.numberOfCores);
			System.out.println("Visualise options is: "+this.visualise);
			System.out.println("The outputFileName is: "+this.outputFileName);
		}
			 
} 
