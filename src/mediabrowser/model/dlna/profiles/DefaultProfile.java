package mediabrowser.model.dlna.profiles;

import mediabrowser.model.dlna.*;

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [XmlRoot("Profile")] public class DefaultProfile : DeviceProfile
public class DefaultProfile extends DeviceProfile
{
	public DefaultProfile()
	{
		setName("Generic Device");

		setProtocolInfo("http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_HD_50_AC3;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_HD_50_AC3_T;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=AVC_TS_HD_50_AC3_ISO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:audio/mpeg:DLNA.ORG_PN=MP3;DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:audio/L16;rate=44100;channels=1:DLNA.ORG_PN=LPCM;DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:audio/L16;rate=44100;channels=2:DLNA.ORG_PN=LPCM;DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:audio/L16;rate=48000;channels=1:DLNA.ORG_PN=LPCM;DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:audio/L16;rate=48000;channels=2:DLNA.ORG_PN=LPCM;DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:audio/x-ms-wma:DLNA.ORG_PN=WMA_BASE;DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:audio/x-ms-wma:DLNA.ORG_PN=WMA_FULL;DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_SM;DLNA.ORG_OP=00;DLNA.ORG_FLAGS=00D00000000000000000000000000000,http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_MED;DLNA.ORG_OP=00;DLNA.ORG_FLAGS=00D00000000000000000000000000000,http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_LRG;DLNA.ORG_OP=00;DLNA.ORG_FLAGS=00D00000000000000000000000000000,http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_TN;DLNA.ORG_OP=00;DLNA.ORG_FLAGS=00D00000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=MPEG1;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=MPEG_PS_PAL;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=MPEG_PS_NTSC;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_EU;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_EU_T;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=MPEG_TS_SD_EU_ISO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_NA;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_NA_T;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=MPEG_TS_SD_NA_ISO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_KO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_KO_T;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=MPEG_TS_SD_KO_ISO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-msvideo:DLNA.ORG_PN=AVI;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-matroska:DLNA.ORG_PN=MATROSKA;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=AVC_MP4_MP_SD_AAC_MULT5;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=AVC_MP4_MP_SD_MPEG1_L3;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=AVC_MP4_MP_SD_AC3;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=AVC_MP4_MP_HD_720p_AAC;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=AVC_MP4_MP_HD_1080i_AAC;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=AVC_MP4_HP_HD_AAC;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=AVC_MP4_LPCM;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=MPEG4_P2_MP4_ASP_AAC;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=MPEG4_P2_MP4_SP_L6_AAC;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mp4:DLNA.ORG_PN=MPEG4_P2_MP4_NDSD;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_MP_SD_AAC_MULT5;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_MP_SD_AAC_MULT5_T;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=AVC_TS_MP_SD_AAC_MULT5_ISO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_MP_SD_MPEG1_L3;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_MP_SD_MPEG1_L3_T;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=AVC_TS_MP_SD_MPEG1_L3_ISO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_MP_HD_AAC_MULT5;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_MP_HD_AAC_MULT5_T;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=AVC_TS_MP_HD_AAC_MULT5_ISO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_MP_HD_MPEG1_L3;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_MP_HD_MPEG1_L3_T;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/mpeg:DLNA.ORG_PN=AVC_TS_MP_HD_MPEG1_L3_ISO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_HD_50_LPCM_T;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-ms-wmv:DLNA.ORG_PN=WMVMED_BASE;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-ms-wmv:DLNA.ORG_PN=WMVMED_FULL;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-ms-wmv:DLNA.ORG_PN=WMVHIGH_FULL;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-ms-wmv:DLNA.ORG_PN=WMVMED_PRO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-ms-wmv:DLNA.ORG_PN=WMVHIGH_PRO;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-ms-asf:DLNA.ORG_PN=VC1_ASF_AP_L1_WMA;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-ms-asf:DLNA.ORG_PN=VC1_ASF_AP_L2_WMA;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000,http-get:*:video/x-ms-asf:DLNA.ORG_PN=VC1_ASF_AP_L3_WMA;DLNA.ORG_OP=11;DLNA.ORG_FLAGS=01500000000000000000000000000000");

		setXDlnaDoc("DMS-1.50");

		setFriendlyName("Media Browser");
		setManufacturer("Media Browser");
		setModelDescription("Media Browser");
		setModelName("Media Browser");
		setModelNumber("Media Browser");
		setModelUrl("http://mediabrowser.tv/");
		setManufacturerUrl("http://mediabrowser.tv/");

		setAlbumArtPn("JPEG_SM");

		setMaxAlbumArtHeight(480);
		setMaxAlbumArtWidth(480);

		setMaxIconWidth(48);
		setMaxIconHeight(48);

		setMaxStreamingBitrate(8000000);
		setMaxStaticBitrate(8000000);
		setMusicStreamingTranscodingBitrate(128000);
		setMusicSyncBitrate(128000);

		setEnableAlbumArtInDidl(false);

		TranscodingProfile tempVar = new TranscodingProfile();
		tempVar.setContainer("mp3");
		tempVar.setAudioCodec("mp3");
		tempVar.setType(DlnaProfileType.Audio);
		TranscodingProfile tempVar2 = new TranscodingProfile();
		tempVar2.setContainer("ts");
		tempVar2.setType(DlnaProfileType.Video);
		tempVar2.setAudioCodec("aac");
		tempVar2.setVideoCodec("h264");
		TranscodingProfile tempVar3 = new TranscodingProfile();
		tempVar3.setContainer("jpeg");
		tempVar3.setType(DlnaProfileType.Photo);
		setTranscodingProfiles(new TranscodingProfile[] {tempVar, tempVar2, tempVar3});

		DirectPlayProfile tempVar4 = new DirectPlayProfile();
		tempVar4.setContainer("mp3,wma");
		tempVar4.setType(DlnaProfileType.Audio);
		DirectPlayProfile tempVar5 = new DirectPlayProfile();
		tempVar5.setContainer("avi,mp4");
		tempVar5.setType(DlnaProfileType.Video);
		setDirectPlayProfiles(new DirectPlayProfile[] {tempVar4, tempVar5});
	}
}