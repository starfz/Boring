package com.susion.boring.music.model;

import java.util.List;

/**
 * Created by susion on 17/2/25.
 */
public class PlayListSong {

    /**
     * data : [{"id":28285912,"url":"http://m8.music.126.net/20170225163525/89227a9621cc31ced65b808b44f05ba3/ymusic/d5a1/e293/6ae4/5ad3ecec595bbe407f28a0263c56f839.mp3","br":320000,"size":10108387,"md5":"5ad3ecec595bbe407f28a0263c56f839","code":200,"expi":1200,"type":"mp3","gain":-1.1799,"fee":0,"uf":null,"payed":0,"flag":2,"canExtend":false}]
     * code : 200
     */

    private int code;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 28285912
         * url : http://m8.music.126.net/20170225163525/89227a9621cc31ced65b808b44f05ba3/ymusic/d5a1/e293/6ae4/5ad3ecec595bbe407f28a0263c56f839.mp3
         * br : 320000
         * size : 10108387
         * md5 : 5ad3ecec595bbe407f28a0263c56f839
         * code : 200
         * expi : 1200
         * type : mp3
         * gain : -1.1799
         * fee : 0
         * uf : null
         * payed : 0
         * flag : 2
         * canExtend : false
         */

        private int id;
        private String url;
        private int br;
        private int size;
        private String md5;
        private int code;
        private int expi;
        private String type;
        private double gain;
        private int fee;
        private Object uf;
        private int payed;
        private int flag;
        private boolean canExtend;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getBr() {
            return br;
        }

        public void setBr(int br) {
            this.br = br;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getMd5() {
            return md5;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public int getExpi() {
            return expi;
        }

        public void setExpi(int expi) {
            this.expi = expi;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getGain() {
            return gain;
        }

        public void setGain(double gain) {
            this.gain = gain;
        }

        public int getFee() {
            return fee;
        }

        public void setFee(int fee) {
            this.fee = fee;
        }

        public Object getUf() {
            return uf;
        }

        public void setUf(Object uf) {
            this.uf = uf;
        }

        public int getPayed() {
            return payed;
        }

        public void setPayed(int payed) {
            this.payed = payed;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public boolean isCanExtend() {
            return canExtend;
        }

        public void setCanExtend(boolean canExtend) {
            this.canExtend = canExtend;
        }
    }
}
