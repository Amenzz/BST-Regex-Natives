class Queue{

	class QNode{
		Node info;
		QNode next;

		QNode(Node info, QNode next){
			this.info = info;
			this.next = next;
		}

		QNode(Node info){
			this(info, null);
		}
	}


	private QNode top, bottom;
	private int items = 0;
	public Queue(){
		this.top = this.bottom = null;
	}

	public boolean isEmpty(){
		return this.top == null;
	}

	public int itemsCount(){
		return this.items;
	}

	public boolean enqueue(Node info){
		QNode node = new QNode(info);
		if(this.isEmpty()){
			this.top = this.bottom = node;
		}
		else{
			this.bottom.next = node;
			this.bottom = node;
		}
		this.items+=1;
		return true;
	}

	public Node dequeue(){
		if(!this.isEmpty()){
			Node node = this.top.info;
			this.top = this.top.next;
			this.items-=1;
			return node;
		}
		return null;
	}

	public Node topEl(){
		if(!this.isEmpty()) return this.top.info;
		return null;
	}
}
