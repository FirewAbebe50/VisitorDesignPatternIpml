package visitorapp;

public interface Visitor {
	
	public void visit(BookLoan book);
	public void visit(Magazineloan magazine);
	public void visit(ResearchPaperLoan researchPaper);

}
