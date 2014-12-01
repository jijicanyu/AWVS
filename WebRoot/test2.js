Ext.onReady(function(){
  Ext.BLANK_IMAGE_URL = '/images/s.gif';
  Ext.chart.Chart.CHART_URL = '/js/ext/resources/charts.swf';
  Ext.QuickTips.init();
  var f = new Ext.form.FormPanel({
    renderTo:Ext.getBody(),
    width:300,
    height:300,
    title:'test',
    items:[{
	    xtype: 'radiogroup',
	    fieldLabel: '上传方式',
	    layout:"colum",
	    border:1,
	    items:[{
	      xtype:'radio',
	      boxLabel:'本地上传',
        inputValue:'local',
        name: 'uploadType',
        checked:true
	    },{
	      xtype:'radio',
	      boxLabel:'网络上传',
        inputValue:'remote',
        name: 'uploadType'
	    }],
//	    listeners:{
//	      'change':function(group,ck){
//          var p1 = Ext.getCmp('panel1');
//          var p2 = Ext.getCmp('panel2');
//          if(ck.inputValue=='remote'){
//            p1.hide();
//            p2.show();
//          }else{
//            p2.hide();
//            p1.show();
//          }
//	      }
//	    }
    },{
      xtype:'panel',
      layout:'column',
      border:false,
      frame:false,
      items:[{
        xtype:'panel',
        id:'panel1',
        border:false,
        frame:false,
        layout:'form',
        columnWidth:1,
        items:{
	        xtype:'textfield',
	        id:'uploadUrl1',
	        fieldLabel:'网络地址'
        }
      },{
        xtype:'panel',
        id:'panel2',
        border:false,
        frame:false,
      //  hidden:true,
        layout:'form',
        columnWidth:1,
        items:[{
	        xtype:'textfield',
	        id:'uploadUrl2',
	        fieldLabel:'网络地址',
	        autoCreate:{
	          tag:'input',
	          type:'file'
	        }
	      }]
      }]
    }]
  });
});