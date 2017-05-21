package imd;

public class Tree {
	
	private No root;
	private Tree leftTree;
	private Tree rightTree;
	
	public Tree(){
		// construtor vazio
	}
	
	public Tree getRightTree(){
		return rightTree;
	}
	
	public void setRightTree(Tree rightTree){
		this.rightTree = rightTree;
	}
	
	public Tree getLeftTree(){
		return leftTree;
	}
	
	public void setLeftTree(Tree leftTree){
		this.leftTree = leftTree;
	}
	
	 public No getRoot() {
	        return root;
	 }

	public void setRoot(No root) {
	        this.root = root;
	}
	
	public void insereAluno(int matricula, String nome) {
        Aluno aluno = new Aluno(matricula, nome);
        No no = new No(aluno);
        inserir(no);
    }

	private void inserir(No no) {
		if(this.root == null){
		   this.root = no;
		}
		else {
			if (no.getAluno().getMatricula() > this.root.getAluno().getMatricula()){
				if (this.rightTree == null){
					this.rightTree = new Tree();
				}
				this.rightTree.inserir(no);
			}
			else if (no.getAluno().getMatricula() < this.root.getAluno().getMatricula()){
				if (this.leftTree == null){
					this.leftTree = new Tree();
				}
				this.leftTree.inserir(no);
			}
		}
		
	}
	
	public void remover(No no){
		if(this.root == null){
			
		}
	}
	
	// Implementação da busca
	public No search_Tree(Tree t, No key){
		if(t.root == key){
			return key;
		}else if(this.root.getAluno().getMatricula() > key.getAluno().getMatricula()){
			return search_Tree(t.leftTree, key);
		}else{
			return search_Tree(t.rightTree, key);
		}
	}
	
	// percorrerInOrdem();
	public void percorrerInOrdem() throws Exception{
		if(this.root == null){
			throw new Exception();
		}else if(this.leftTree!=null){
			this.leftTree.percorrerInOrdem();
		}this.root.getAluno().getMatricula();
		if(this.rightTree!=null){
			this.rightTree.percorrerInOrdem();
		}
	}

	
	//percorrerPreOrdem();
	public void percorrerPreOrdem() throws Exception{
		this.root.getAluno().getMatricula();
		if(this.root == null){
			throw new Exception();
		}else if(this.leftTree!= null){
			this.leftTree.percorrerPreOrdem();
		}if(this.rightTree!=null){
			this.rightTree.percorrerPreOrdem();
		}
	}
	
	// percorrerPosOrdem();
	public void percorrerPosOrdem() throws Exception{
		if(this.root == null){
			throw new Exception();
		}else if(this.leftTree!= null){
			this.leftTree.percorrerPosOrdem();
		}if(this.rightTree!=null){
			this.rightTree.percorrerPosOrdem();
		}
		this.root.getAluno().getMatricula();
	}

}