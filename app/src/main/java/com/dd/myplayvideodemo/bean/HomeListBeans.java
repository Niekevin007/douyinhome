package com.dd.myplayvideodemo.bean;

import java.util.List;

public class HomeListBeans{


    /**
     * code : 0
     * msg : success
     * body : {"records":[{"pkId":9536,"voideId":"1b4c145b3b3c46d683340247d78cb5e8","userId":1552,"musicId":1,"classification":"0","title":"我运动我快乐","coverPath":"http://new-coin-vod.xgyxserv.com/1b4c145b3b3c46d683340247d78cb5e8/snapshots/580a998e50cd43c98d61c9692b25fcd6-00002.jpg","appraiseNum":0,"liveNum":1537,"repostNum":0,"position":"","authority":1,"status":1,"createdTime":"2020-05-18T17:54:08","browseNum":0,"warningStatus":0,"sealStatus":0,"userInfo":[{"pkId":1552,"userNo":"i3y601ir","phone":"13563622704","name":"q8IXYrpg6z","avatarPath":"http://new-coin-vod.xgyxserv.com/image/default/9BC4F869EC124E86A7ACBAB650639F7F-6-2.png","sex":1,"type":0,"birthday":"1963-01-26","authority":1,"over":1,"warningStatus":0,"authentication":1,"accid":"63f646ff4ccc40ed9364c0507a485b41","yunxinToken":"cdba8861510679877f11d9be3e5b77cb","createdTime":"2020-03-26T18:35:21","focus":false,"taskStatus":0,"djlWalletAddress":"","djl":0,"djlCoin":0,"rewardDjlCoin":0,"djlPool":0,"acode":"000300997"}],"response":{"requestId":"20199D91-37D0-4319-8789-8711C93081BC","playInfoList":[{"width":720,"height":1280,"size":6476938,"playURL":"http://new-coin-vod.znkjsrv.com/original/workflow/1d2b5e31-1722cc89923-0004-53d7-f1b-f7a26.mp4","bitrate":"3470.33","definition":"OD","duration":"14.931","format":"mp4","fps":"25.0","encrypt":0,"streamType":"video","jobId":"1b4c145b3b3c46d683340247d78cb5e802","preprocessStatus":"UnPreprocess","status":"Normal","creationTime":"2020-05-19T11:55:04Z","modificationTime":"2020-05-19T11:55:04Z","narrowBandType":"0"}],"videoBase":{"outputType":"cdn","coverURL":"http://new-coin-vod.znkjsrv.com/1b4c145b3b3c46d683340247d78cb5e8/snapshots/580a998e50cd43c98d61c9692b25fcd6-00002.jpg","duration":"14.931","status":"Normal","title":"我运动我快乐","videoId":"1b4c145b3b3c46d683340247d78cb5e8","mediaType":"video","creationTime":"2020-05-19T11:54:03Z","transcodeMode":"NoTranscode","thumbnailList":[]}},"rewardNumString":"0","focusFlag":false,"fondFlag":false}]}
     */

    private int code;
    private String msg;
    private BodyBean body;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public static class BodyBean {
        private List<RecordsBean> records;

        public List<RecordsBean> getRecords() {
            return records;
        }

        public void setRecords(List<RecordsBean> records) {
            this.records = records;
        }

        public static class RecordsBean {
            /**
             * pkId : 9536
             * voideId : 1b4c145b3b3c46d683340247d78cb5e8
             * userId : 1552
             * musicId : 1
             * classification : 0
             * title : 我运动我快乐
             * coverPath : http://new-coin-vod.xgyxserv.com/1b4c145b3b3c46d683340247d78cb5e8/snapshots/580a998e50cd43c98d61c9692b25fcd6-00002.jpg
             * appraiseNum : 0
             * liveNum : 1537
             * repostNum : 0
             * position :
             * authority : 1
             * status : 1
             * createdTime : 2020-05-18T17:54:08
             * browseNum : 0
             * warningStatus : 0
             * sealStatus : 0
             * userInfo : [{"pkId":1552,"userNo":"i3y601ir","phone":"13563622704","name":"q8IXYrpg6z","avatarPath":"http://new-coin-vod.xgyxserv.com/image/default/9BC4F869EC124E86A7ACBAB650639F7F-6-2.png","sex":1,"type":0,"birthday":"1963-01-26","authority":1,"over":1,"warningStatus":0,"authentication":1,"accid":"63f646ff4ccc40ed9364c0507a485b41","yunxinToken":"cdba8861510679877f11d9be3e5b77cb","createdTime":"2020-03-26T18:35:21","focus":false,"taskStatus":0,"djlWalletAddress":"","djl":0,"djlCoin":0,"rewardDjlCoin":0,"djlPool":0,"acode":"000300997"}]
             * response : {"requestId":"20199D91-37D0-4319-8789-8711C93081BC","playInfoList":[{"width":720,"height":1280,"size":6476938,"playURL":"http://new-coin-vod.znkjsrv.com/original/workflow/1d2b5e31-1722cc89923-0004-53d7-f1b-f7a26.mp4","bitrate":"3470.33","definition":"OD","duration":"14.931","format":"mp4","fps":"25.0","encrypt":0,"streamType":"video","jobId":"1b4c145b3b3c46d683340247d78cb5e802","preprocessStatus":"UnPreprocess","status":"Normal","creationTime":"2020-05-19T11:55:04Z","modificationTime":"2020-05-19T11:55:04Z","narrowBandType":"0"}],"videoBase":{"outputType":"cdn","coverURL":"http://new-coin-vod.znkjsrv.com/1b4c145b3b3c46d683340247d78cb5e8/snapshots/580a998e50cd43c98d61c9692b25fcd6-00002.jpg","duration":"14.931","status":"Normal","title":"我运动我快乐","videoId":"1b4c145b3b3c46d683340247d78cb5e8","mediaType":"video","creationTime":"2020-05-19T11:54:03Z","transcodeMode":"NoTranscode","thumbnailList":[]}}
             * rewardNumString : 0
             * focusFlag : false
             * fondFlag : false
             */

            private int pkId;
            private String voideId;
            private int userId;
            private int musicId;
            private String classification;
            private String title;
            private String coverPath;
            private int appraiseNum;
            private int liveNum;
            private int repostNum;
            private String position;
            private int authority;
            private int status;
            private String createdTime;
            private int browseNum;
            private int warningStatus;
            private int sealStatus;
            private ResponseBean response;
            private String rewardNumString;
            private boolean focusFlag;
            private boolean fondFlag;
            private List<UserInfoBean> userInfo;

            public int getPkId() {
                return pkId;
            }

            public void setPkId(int pkId) {
                this.pkId = pkId;
            }

            public String getVoideId() {
                return voideId;
            }

            public void setVoideId(String voideId) {
                this.voideId = voideId;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getMusicId() {
                return musicId;
            }

            public void setMusicId(int musicId) {
                this.musicId = musicId;
            }

            public String getClassification() {
                return classification;
            }

            public void setClassification(String classification) {
                this.classification = classification;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCoverPath() {
                return coverPath;
            }

            public void setCoverPath(String coverPath) {
                this.coverPath = coverPath;
            }

            public int getAppraiseNum() {
                return appraiseNum;
            }

            public void setAppraiseNum(int appraiseNum) {
                this.appraiseNum = appraiseNum;
            }

            public int getLiveNum() {
                return liveNum;
            }

            public void setLiveNum(int liveNum) {
                this.liveNum = liveNum;
            }

            public int getRepostNum() {
                return repostNum;
            }

            public void setRepostNum(int repostNum) {
                this.repostNum = repostNum;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public int getAuthority() {
                return authority;
            }

            public void setAuthority(int authority) {
                this.authority = authority;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getCreatedTime() {
                return createdTime;
            }

            public void setCreatedTime(String createdTime) {
                this.createdTime = createdTime;
            }

            public int getBrowseNum() {
                return browseNum;
            }

            public void setBrowseNum(int browseNum) {
                this.browseNum = browseNum;
            }

            public int getWarningStatus() {
                return warningStatus;
            }

            public void setWarningStatus(int warningStatus) {
                this.warningStatus = warningStatus;
            }

            public int getSealStatus() {
                return sealStatus;
            }

            public void setSealStatus(int sealStatus) {
                this.sealStatus = sealStatus;
            }

            public ResponseBean getResponse() {
                return response;
            }

            public void setResponse(ResponseBean response) {
                this.response = response;
            }

            public String getRewardNumString() {
                return rewardNumString;
            }

            public void setRewardNumString(String rewardNumString) {
                this.rewardNumString = rewardNumString;
            }

            public boolean isFocusFlag() {
                return focusFlag;
            }

            public void setFocusFlag(boolean focusFlag) {
                this.focusFlag = focusFlag;
            }

            public boolean isFondFlag() {
                return fondFlag;
            }

            public void setFondFlag(boolean fondFlag) {
                this.fondFlag = fondFlag;
            }

            public List<UserInfoBean> getUserInfo() {
                return userInfo;
            }

            public void setUserInfo(List<UserInfoBean> userInfo) {
                this.userInfo = userInfo;
            }

            public static class ResponseBean {
                /**
                 * requestId : 20199D91-37D0-4319-8789-8711C93081BC
                 * playInfoList : [{"width":720,"height":1280,"size":6476938,"playURL":"http://new-coin-vod.znkjsrv.com/original/workflow/1d2b5e31-1722cc89923-0004-53d7-f1b-f7a26.mp4","bitrate":"3470.33","definition":"OD","duration":"14.931","format":"mp4","fps":"25.0","encrypt":0,"streamType":"video","jobId":"1b4c145b3b3c46d683340247d78cb5e802","preprocessStatus":"UnPreprocess","status":"Normal","creationTime":"2020-05-19T11:55:04Z","modificationTime":"2020-05-19T11:55:04Z","narrowBandType":"0"}]
                 * videoBase : {"outputType":"cdn","coverURL":"http://new-coin-vod.znkjsrv.com/1b4c145b3b3c46d683340247d78cb5e8/snapshots/580a998e50cd43c98d61c9692b25fcd6-00002.jpg","duration":"14.931","status":"Normal","title":"我运动我快乐","videoId":"1b4c145b3b3c46d683340247d78cb5e8","mediaType":"video","creationTime":"2020-05-19T11:54:03Z","transcodeMode":"NoTranscode","thumbnailList":[]}
                 */

                private String requestId;
                private VideoBaseBean videoBase;
                private List<PlayInfoListBean> playInfoList;

                public String getRequestId() {
                    return requestId;
                }

                public void setRequestId(String requestId) {
                    this.requestId = requestId;
                }

                public VideoBaseBean getVideoBase() {
                    return videoBase;
                }

                public void setVideoBase(VideoBaseBean videoBase) {
                    this.videoBase = videoBase;
                }

                public List<PlayInfoListBean> getPlayInfoList() {
                    return playInfoList;
                }

                public void setPlayInfoList(List<PlayInfoListBean> playInfoList) {
                    this.playInfoList = playInfoList;
                }

                public static class VideoBaseBean {
                    /**
                     * outputType : cdn
                     * coverURL : http://new-coin-vod.znkjsrv.com/1b4c145b3b3c46d683340247d78cb5e8/snapshots/580a998e50cd43c98d61c9692b25fcd6-00002.jpg
                     * duration : 14.931
                     * status : Normal
                     * title : 我运动我快乐
                     * videoId : 1b4c145b3b3c46d683340247d78cb5e8
                     * mediaType : video
                     * creationTime : 2020-05-19T11:54:03Z
                     * transcodeMode : NoTranscode
                     * thumbnailList : []
                     */

                    private String outputType;
                    private String coverURL;
                    private String duration;
                    private String status;
                    private String title;
                    private String videoId;
                    private String mediaType;
                    private String creationTime;
                    private String transcodeMode;
                    private List<?> thumbnailList;

                    public String getOutputType() {
                        return outputType;
                    }

                    public void setOutputType(String outputType) {
                        this.outputType = outputType;
                    }

                    public String getCoverURL() {
                        return coverURL;
                    }

                    public void setCoverURL(String coverURL) {
                        this.coverURL = coverURL;
                    }

                    public String getDuration() {
                        return duration;
                    }

                    public void setDuration(String duration) {
                        this.duration = duration;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getVideoId() {
                        return videoId;
                    }

                    public void setVideoId(String videoId) {
                        this.videoId = videoId;
                    }

                    public String getMediaType() {
                        return mediaType;
                    }

                    public void setMediaType(String mediaType) {
                        this.mediaType = mediaType;
                    }

                    public String getCreationTime() {
                        return creationTime;
                    }

                    public void setCreationTime(String creationTime) {
                        this.creationTime = creationTime;
                    }

                    public String getTranscodeMode() {
                        return transcodeMode;
                    }

                    public void setTranscodeMode(String transcodeMode) {
                        this.transcodeMode = transcodeMode;
                    }

                    public List<?> getThumbnailList() {
                        return thumbnailList;
                    }

                    public void setThumbnailList(List<?> thumbnailList) {
                        this.thumbnailList = thumbnailList;
                    }
                }

                public static class PlayInfoListBean {
                    /**
                     * width : 720
                     * height : 1280
                     * size : 6476938
                     * playURL : http://new-coin-vod.znkjsrv.com/original/workflow/1d2b5e31-1722cc89923-0004-53d7-f1b-f7a26.mp4
                     * bitrate : 3470.33
                     * definition : OD
                     * duration : 14.931
                     * format : mp4
                     * fps : 25.0
                     * encrypt : 0
                     * streamType : video
                     * jobId : 1b4c145b3b3c46d683340247d78cb5e802
                     * preprocessStatus : UnPreprocess
                     * status : Normal
                     * creationTime : 2020-05-19T11:55:04Z
                     * modificationTime : 2020-05-19T11:55:04Z
                     * narrowBandType : 0
                     */

                    private int width;
                    private int height;
                    private int size;
                    private String playURL;
                    private String bitrate;
                    private String definition;
                    private String duration;
                    private String format;
                    private String fps;
                    private int encrypt;
                    private String streamType;
                    private String jobId;
                    private String preprocessStatus;
                    private String status;
                    private String creationTime;
                    private String modificationTime;
                    private String narrowBandType;

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getSize() {
                        return size;
                    }

                    public void setSize(int size) {
                        this.size = size;
                    }

                    public String getPlayURL() {
                        return playURL;
                    }

                    public void setPlayURL(String playURL) {
                        this.playURL = playURL;
                    }

                    public String getBitrate() {
                        return bitrate;
                    }

                    public void setBitrate(String bitrate) {
                        this.bitrate = bitrate;
                    }

                    public String getDefinition() {
                        return definition;
                    }

                    public void setDefinition(String definition) {
                        this.definition = definition;
                    }

                    public String getDuration() {
                        return duration;
                    }

                    public void setDuration(String duration) {
                        this.duration = duration;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public void setFormat(String format) {
                        this.format = format;
                    }

                    public String getFps() {
                        return fps;
                    }

                    public void setFps(String fps) {
                        this.fps = fps;
                    }

                    public int getEncrypt() {
                        return encrypt;
                    }

                    public void setEncrypt(int encrypt) {
                        this.encrypt = encrypt;
                    }

                    public String getStreamType() {
                        return streamType;
                    }

                    public void setStreamType(String streamType) {
                        this.streamType = streamType;
                    }

                    public String getJobId() {
                        return jobId;
                    }

                    public void setJobId(String jobId) {
                        this.jobId = jobId;
                    }

                    public String getPreprocessStatus() {
                        return preprocessStatus;
                    }

                    public void setPreprocessStatus(String preprocessStatus) {
                        this.preprocessStatus = preprocessStatus;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getCreationTime() {
                        return creationTime;
                    }

                    public void setCreationTime(String creationTime) {
                        this.creationTime = creationTime;
                    }

                    public String getModificationTime() {
                        return modificationTime;
                    }

                    public void setModificationTime(String modificationTime) {
                        this.modificationTime = modificationTime;
                    }

                    public String getNarrowBandType() {
                        return narrowBandType;
                    }

                    public void setNarrowBandType(String narrowBandType) {
                        this.narrowBandType = narrowBandType;
                    }
                }
            }

            public static class UserInfoBean {
                /**
                 * pkId : 1552
                 * userNo : i3y601ir
                 * phone : 13563622704
                 * name : q8IXYrpg6z
                 * avatarPath : http://new-coin-vod.xgyxserv.com/image/default/9BC4F869EC124E86A7ACBAB650639F7F-6-2.png
                 * sex : 1
                 * type : 0
                 * birthday : 1963-01-26
                 * authority : 1
                 * over : 1
                 * warningStatus : 0
                 * authentication : 1
                 * accid : 63f646ff4ccc40ed9364c0507a485b41
                 * yunxinToken : cdba8861510679877f11d9be3e5b77cb
                 * createdTime : 2020-03-26T18:35:21
                 * focus : false
                 * taskStatus : 0
                 * djlWalletAddress :
                 * djl : 0
                 * djlCoin : 0.0
                 * rewardDjlCoin : 0.0
                 * djlPool : 0.0
                 * acode : 000300997
                 */

                private int pkId;
                private String userNo;
                private String phone;
                private String name;
                private String avatarPath;
                private int sex;
                private int type;
                private String birthday;
                private int authority;
                private int over;
                private int warningStatus;
                private int authentication;
                private String accid;
                private String yunxinToken;
                private String createdTime;
                private boolean focus;
                private int taskStatus;
                private String djlWalletAddress;
                private int djl;
                private double djlCoin;
                private double rewardDjlCoin;
                private double djlPool;
                private String acode;

                public int getPkId() {
                    return pkId;
                }

                public void setPkId(int pkId) {
                    this.pkId = pkId;
                }

                public String getUserNo() {
                    return userNo;
                }

                public void setUserNo(String userNo) {
                    this.userNo = userNo;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAvatarPath() {
                    return avatarPath;
                }

                public void setAvatarPath(String avatarPath) {
                    this.avatarPath = avatarPath;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getBirthday() {
                    return birthday;
                }

                public void setBirthday(String birthday) {
                    this.birthday = birthday;
                }

                public int getAuthority() {
                    return authority;
                }

                public void setAuthority(int authority) {
                    this.authority = authority;
                }

                public int getOver() {
                    return over;
                }

                public void setOver(int over) {
                    this.over = over;
                }

                public int getWarningStatus() {
                    return warningStatus;
                }

                public void setWarningStatus(int warningStatus) {
                    this.warningStatus = warningStatus;
                }

                public int getAuthentication() {
                    return authentication;
                }

                public void setAuthentication(int authentication) {
                    this.authentication = authentication;
                }

                public String getAccid() {
                    return accid;
                }

                public void setAccid(String accid) {
                    this.accid = accid;
                }

                public String getYunxinToken() {
                    return yunxinToken;
                }

                public void setYunxinToken(String yunxinToken) {
                    this.yunxinToken = yunxinToken;
                }

                public String getCreatedTime() {
                    return createdTime;
                }

                public void setCreatedTime(String createdTime) {
                    this.createdTime = createdTime;
                }

                public boolean isFocus() {
                    return focus;
                }

                public void setFocus(boolean focus) {
                    this.focus = focus;
                }

                public int getTaskStatus() {
                    return taskStatus;
                }

                public void setTaskStatus(int taskStatus) {
                    this.taskStatus = taskStatus;
                }

                public String getDjlWalletAddress() {
                    return djlWalletAddress;
                }

                public void setDjlWalletAddress(String djlWalletAddress) {
                    this.djlWalletAddress = djlWalletAddress;
                }

                public int getDjl() {
                    return djl;
                }

                public void setDjl(int djl) {
                    this.djl = djl;
                }

                public double getDjlCoin() {
                    return djlCoin;
                }

                public void setDjlCoin(double djlCoin) {
                    this.djlCoin = djlCoin;
                }

                public double getRewardDjlCoin() {
                    return rewardDjlCoin;
                }

                public void setRewardDjlCoin(double rewardDjlCoin) {
                    this.rewardDjlCoin = rewardDjlCoin;
                }

                public double getDjlPool() {
                    return djlPool;
                }

                public void setDjlPool(double djlPool) {
                    this.djlPool = djlPool;
                }

                public String getAcode() {
                    return acode;
                }

                public void setAcode(String acode) {
                    this.acode = acode;
                }
            }
        }
    }
}
