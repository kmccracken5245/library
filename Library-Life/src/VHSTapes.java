
public class VHSTapes implements Item{

	private String genre = "";
	private String artista = "";
	private String title = "";
	private String codenumber = "";
	private int length = 0;
	
	
	@Override
	public String genre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setgenre(String genre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String artist() {
		// TODO Auto-generated method stub
		return artista;
	}

	@Override
	public void setartist(String artist) {
		artista = artist;
		
	}
	
	public void setLength (int len)
	{
		length = len;
	}

	@Override
	public String title() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void settitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String codenumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setcodenumber() {
		// TODO Auto-generated method stub
		
	}

}
