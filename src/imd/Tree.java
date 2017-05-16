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
	
	// faltando implementar percorrerInOrdem();
	public void in_Ordem(No root){
		if(this.root == null){
			return;
		}
		this.leftTree.in_Ordem(root);
		this.rightTree.in_Ordem(root);
		
	}

	
	// faltando implementar percorrerPreOrdem();
	public void pre_Ordem(No root){
		if(root == null){
			//
		}
		
	}
	
	// faltando implementar percorrerPosOrdem();
	public void pos_Ordem(No root){
		if(this.root == null){
			return;
		}this.leftTree.pos_Ordem(root);
		this.rightTree.pos_Ordem(root);
	}

}