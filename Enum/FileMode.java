package Enum;
public enum FileMode 
{
    WRITE(true, false), 
    READ(false, true), 
    READWRITE(true, true), 
    APPEND(true, false);

    private boolean write;
    private boolean read;

    FileMode(boolean cwrite, boolean cread){
        this.read = cread;
        this.write = cwrite;
    }

    public boolean canWrite()
    {
        return this.write;
    }

    public boolean canRead()
    {
        return this.read;
    }
}
