package assignment7.three;

public class ExecuteBooks extends Website implements Books{

    @Override
    public void showAudioBooks() { System.out.println("Showing Audio Books"); }

    @Override
    public void addAudioBooks() {
        System.out.println("Adding Audio Books");
    }

    @Override
    public void removeAudioBooks() {
        System.out.println("Removing Audio Books");
    }

    @Override
    public void showAllTypesOfBooks() {
        System.out.println("Showing all types of books");
    }

    @Override
    public void showEbooks() { System.out.println("Showing Ebooks"); }

    @Override
    public void addEBook() { System.out.println("Adding Ebooks"); }

    @Override
    public void removeEBook() { System.out.println("Removing Ebooks"); }

    @Override
    public void showPaperbacks() { System.out.println("Showing paperbacks");
    }

    @Override
    public void addPaperback() { System.out.println("Adding paperbacks"); }

    @Override
    public void removePaperback() { System.out.println("Removing paperbacks"); }

    public void callAudioBooks(AudioBooks audioBooks)
    {
        audioBooks.addAudioBooks();
        audioBooks.removeAudioBooks();
        audioBooks.showAudioBooks();
    }

    public void callEBooks(EBooks eBooks)
    {
        eBooks.addEBook();
        eBooks.removeEBook();
        eBooks.showEbooks();
    }

    public void callPaperbacks(PaperbackBooks paperbackBooks)
    {
        paperbackBooks.addPaperback();
        paperbackBooks.removePaperback();
        paperbackBooks.showPaperbacks();
    }

    public static void main(String args[])
    {
        ExecuteBooks instance = new ExecuteBooks();
        instance.callAudioBooks(instance);
        instance.callEBooks(instance);
        instance.callPaperbacks(instance);
    }
}
