package Enum;
public final class EnumBehavior {
    private boolean write;
    private boolean read;
    //Não pode fazer um new EnumBehavior porque o construtor é privado
    EnumBehavior(boolean cwrite, boolean cread){
        this.read = cread;
        this.write = cwrite;
    }
    
    public final static EnumBehavior READ = new EnumBehavior(false, true);
    public final static EnumBehavior WRITE = new EnumBehavior(true, false);
    public final static EnumBehavior READWRITE = new EnumBehavior(true, true);
    public final static EnumBehavior APPEND = new EnumBehavior(true, false);
    

    public boolean canWrite()
    {
        return this.write;
    }

    public boolean canRead()
    {
        return this.read;
    }
}
