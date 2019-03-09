package com.net.markj.pattern06_strategy_pattern;

/**
 * Created by Kron Xu on 2019/3/10 1:44
 * Description:
 */
public class EncryptionCreator {
    private Encryption encryption;
    public EncryptionCreator(Encryption encryption){
        this.encryption = encryption;
    }

    public void encrypt(){
        encryption.encrypt();
    }
}
