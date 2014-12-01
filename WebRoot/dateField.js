Ext.onReady(function(){
	
	Ext.QuickTips.init();
	//Ext.window.MessageBox("提示信息","hello world");
	//Ext.define();
	Ext.apply(Ext.form.VTypes, {
		daterange : function(val, field) {
			var date = field.parseDate(val);
			if (!date) {
				return;
			}
			if (field.startDateField
					&& (!this.dateRangeMax || (date.getTime() != this.dateRangeMax
							.getTime()))) {
				var start = Ext.getCmp(field.startDateField);
				start.setMaxValue(date);
				start.validate();
				this.dateRangeMax = date;
			} else if (field.endDateField
					&& (!this.dateRangeMin || (date.getTime() != this.dateRangeMin
							.getTime()))) {
				var end = Ext.getCmp(field.endDateField);
				end.setMinValue(date);
				end.validate();
				this.dateRangeMin = date;
			}
			/*
			 * Always return true since we're only using this vtype to set
			 * the min/max allowed values (these are tested for after the
			 * vtype test)
			 */
			return true;
		}
	});
	
	
	
	
	
	
	
	
	
	
	var panel = new Ext.Panel({
	renderTo: Ext.getBody(),
	    width: 300,
    bodyPadding: 10,
    title: 'Dates',
    items: [{
        xtype: 'datefield',
        anchor: '100%',
        fieldLabel: 'From',
        id:"from_date",
        name: 'from_date',
        vtype : 'daterange',//daterange类型为上代码定义的类型
        emptyText:"yyyy-MM-dd",
        endDateField : 'to_date',//必须跟endDate的id名相同 
        format: 'Y-m-d'
    }, {
        xtype: 'datefield',
        anchor: '100%',
        fieldLabel: 'To',
        id : 'to_date',
        name: 'to_date',
        emptyText:"yyyy-MM-dd",
        format: 'Y-m-d'
    }, {
        xtype: 'button',
        text:"导出",
        name: 'to_date',
        handler:aa
    }]});
	
	function  aa(){
		alert(aaa);
		var date = Ext.get(startDate).getValue();
		alert(date);
	    Ext.MessageBox.alert("我是底部按钮1","点击底部按钮1时弹出的弹出框");
	 }
	
});

