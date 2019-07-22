CREATE TABLE `stock_price_detail` (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `stock_code` varchar(32) NOT NULL COMMENT '股票代码',
  `current_price` int(11) NOT NULL COMMENT '当前价格',
  `bid1` int(11) NOT NULL COMMENT '买一价格，单位厘',
  `bidvol1` int(11) NOT NULL COMMENT '买一量，单位笔',
  `bid2` int(11) NOT NULL COMMENT '买二价格，单位厘',
  `bidvol2` int(11) NOT NULL COMMENT '买二量，单位笔',
  `bid3` int(11) NOT NULL,
  `bidvol3` int(11) NOT NULL,
  `bid4` int(11) NOT NULL,
  `bidvol4` int(11) NOT NULL,
  `bid5` int(11) NOT NULL,
  `bidvol5` int(11) NOT NULL,
  `ask1` int(11) NOT NULL COMMENT '卖一价格，单位厘',
  `askvol1` int(11) NOT NULL COMMENT '卖一量，单位笔',
  `ask2` int(11) NOT NULL,
  `askvol2` int(11) NOT NULL,
  `ask3` int(11) NOT NULL,
  `askvol3` int(11) NOT NULL,
  `ask4` int(11) NOT NULL,
  `askvol4` int(11) NOT NULL,
  `ask5` int(11) NOT NULL,
  `askvol5` int(11) NOT NULL,
  `date_timestamp` bigint(11) NOT NULL COMMENT '时间戳'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='股票实时买卖5档数据';