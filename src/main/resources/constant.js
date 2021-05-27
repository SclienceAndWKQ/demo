/*
 * @Description: 配置项
 * @LastEditTime: 2019-11-18 09:44:51
 */

window.deploy = {
  // ip: 'http://192.168.0.241:8090', // ip地址
  ip: 'http://20.16.143.57:9906', // ip地址
  //ip: 'http://192.168.0.192:8888',
  // ip: 'http://192.168.0.83:8090', // ip地址
  logoTitle: '台州市不动产登记自助服务平台', // 头部logo旁边的标题
  demoMode: false, // 是否演示模式 true为是，false为否
  machineNo: '6080', // 8086 6080
  logoutPwd: '123456', // 退出密码
  testmessage: {
    name: '1111',
    idCardNumber: '2222',
    photo: 'img'
  },
  chadang: { // 查档里面的配置项
    haveHouse: '台州有房', // 有房无房报表名称
    yy_haveHouse: '台州有房', //有房无房报表名称 -- 异议打印报表
    belongTo: '台州权属', // 权属报表名称
    yy_belongTo: '台州权属', // 权属报表名称 -- 异议打印报表
    haveHouseChapterSite: '台州市不动产登记中心', // 有房无房盖章位置名称 （如果不盖章传-2） // 杭州市规划和自然资源局
    yy_haveHouseChapterSite: '台州市不动产登记中心', // 有房无房盖章位置名称 （如果不盖章传-2） // 杭州市规划和自然资源局 -- 异议打印盖章位置
    belongToChapterSite: '台州市不动产登记中心', // 权属盖章位置名称（如果不盖章传-2） // 杭州市规划和自然资源局
    yy_belongToChapterSite: '台州市不动产登记中心', // 权属盖章位置名称（如果不盖章传-2） // 杭州市规划和自然资源局 -- 异议打印盖章位置
    parperbox: 4, // 查档打印纸盒
    // 有房无房演示数据
    haveHousePrintData: {
      'bh': '1001025-201908-01233430',
      'zl': null,
      'houseCount': null,
      'staticDataList': [{
        'name': 'ywbh',
        'value': '1001025-201908-01233430'
      }, {
        'name': 'ewm',
        'value': 'iVBORw0KGgoAAAANSUhEUgAAAPoAAAD6CAIAAAAHjs1qAAAEtUlEQVR42u3bQXLDMAwDQP//0+0b2hEFwl6cPY5CLXPB5PkR+UweIxDcRXAXwV0EdxHcRXAXwV3kCvenJKfO/+fZHXrPqc+dPk+7B9xxxx133HHHHXfccccdd9xxxx133HHHHfet3GMdwTDTt67HtvkHz4M77rjjjjvuuOOOO+6444477rjjjjvuuONexT1VG7Vc59fWdaEH3HHHHXfccccdd9xxxx133HHHHXfccccdd9w/sH7tfHHHHXfccccdd9xxxx133HHHHXfccccdd9xx/3bNtO2aUzUW7rjjjjvuuOOOO+6444477rjjjjvuuOOOO+67uU+nncvXaqaFHnDHHXfccccdd9xxxx133HHHHXfccccdd9xXct+W9tql/fkWD7h7HnfcPY877p7HHXfccccdd9xxxx133HFPc/9aUvXNdC3lZnHHHXfccccdd9xxxx133HHHHXfccccdd9w7uadqixSL9vNsW9cL78Edd9xxxx133HHHHXfccccdd9xxxx133HFfyT3194vpc174e0Fkni18l9ZMuOOOO+6444477rjjjjvuuOOOO+6444477uPcW2qmFLu3pr0WxB133HHHHXfccccdd9xxxx133HHHHXfccd/KfbpeabmG6fOkuLQ8/w8/uOOOO+6444477rjjjjvuuOOOO+6444477lHuKdbtTK1lthbEHXfccccdd9xxxx133HHHHXfccccdd9xx38p9W93zwVokUttNJ3hO3HHHHXfccccdd9xxxx133HHHHXfccccd95XcW67zrdc//TPx1p8h3HHHHXfccccdd9xxxx133HHHHXfccccd963cT41v21jb/+7QPp+lNRPuuOOOO+6444477rjjjjvuuOOOO+644477OPf2GuLUNWw7j5rpaquKO+6444477rjjjjvuuOOOO+6444477rjjHquZUu9pZzG9lu3139JWFXfccccdd9xxxx133HHHHXfccccdd9xxx30du2c40+N+ytP+84E77rjjjjvuuOOOO+6444477rjjjjvuuOO+lfu2WmRbHTZdr6TqvNQ9XpgD7rjjjjvuuOOOO+6444477rjjjjvuuOOOe5R76rjbaqOWNWupvYLzwR133HHHHXfccccdd9xxxx133HHHHXfccY9yb09qPVLvmeY4vWYXfj5wxx133HHHHXfccccdd9xxxx133HHHHXfco9yfkrx1nbbVOqna6OC944477rjjjjvuuOOOO+6444477rjjjjvuuK/k3s6rvcZqn09wbrjjjjvuuOOOO+6444477rjjjjvuuOOOO+5V3FtqkWleqfqsvRa8sK6444477rjjjjvuuOOOO+6444477rjjjjvuuA/UIqnvlVrXdqan7h133HHHHXfccccdd9xxxx133HHHHXfccccd9x0101vXI8hOzYQ77rjjjjvuuOOOO+6444477rjjjjvuuOM+8PWmx3Hq/du4nzpnS2108PvijjvuuOOOO+6444477rjjjjvuuOOOO+64r+Tefp0t67ptvVvWAHfccccdd9xxxx133HHHHXfccccdd9xxx30rd5GXBXfBXQR3EdxFcBfBXQR3EdxFzuUX2bBkV+HfgCkAAAAASUVORK5CYII='
      }, {
        'name': 'XM',
        'value': '陶小红'
      }],
      'dynamicDataList': [
        [{
          'name': 'XM',
          'value': '陶小红'
        }, {
          'name': 'ZJH',
          'value': '330329197005113643'
        }]
      ],
      'dynamicDataList2': [
        [{
          'name': 'zl',
          'value': '洋溪街道洋锦大厦*幢一单元***室'
        }, {
          'name': 'bdcqzh',
          'value': '浙(2017)建德市不动产权第0009598号'
        }, {
          'name': 'qlr',
          'value': '吴江浩'
        }, {
          'name': 'qllx',
          'value': ''
        }, {
          'name': 'qlxz',
          'value': '出让/存量房'
        }, {
          'name': 'djsj',
          'value': '2017-06-20'
        }, {
          'name': 'scjzmj',
          'value': '126.66'
        }, {
          'name': 'fwyt',
          'value': '商务金融用地/非住宅'
        }, {
          'name': 'qszt',
          'value': '现状'
        }, {
          'name': 'zyzxsj',
          'value': ''
        }]
      ],
      'dynamicDataList3': null,
      'dynamicDataList4': null,
      'dynamicDataList5': null
    },
    // 权属演示数据
    belongToPrintData: [
      {
        'bh': '1001025-201904-01204625-0',
        'zl': '杭州市盛世钱塘花园*幢*单元***室',
        'houseCount': null,
        'staticDataList': [{
          'name': 'ywbh',
          'value': '1001025-201904-01204625'
        }, {
          'name': 'ewm',
          'value': 'iVBORw0KGgoAAAANSUhEUgAAAPoAAAD6CAIAAAAHjs1qAAAEqElEQVR42u3bwZHDMAwDwPTf9F0TpkHQi7fGkamVP5j8/kQ+k58RCO4iuIvgLoK7CO4iuIvgLvIK919JHpvFst/dtv8DHnDHHXfccccdd9xxxx133HHHHXfccccdd9xXco91BCXcn1o/ffzT6xd6wB133HHHHXfccccdd9xxxx133HHHHXfcca/i3nI8246tfZ4t+8cdd9xxxx133HHHHXfccccdd9xxxx133HHHfffxXK3JcMcdd9xxxx133HHHHXfccccdd9xxxx133HHHfdOxpfavZsIdd9xxxx133HHHHXfccccdd9xxxx133HG/xX06LVxSx9zyuQl6wB133HHHHXfccccdd9xxxx133HHHHXfccV/JfVu21ShfW9/iAXfrccfdetxxtx533HHHHXfccccdd9xxxz3N/Wt5cKyjXLbVdk1HTDnuuOOOO+6444477rjjjjvuuOOOO+64436B+3RtNM0x9V7t1yl1jrjjjjvuuOOOO+6444477rjjjjvuuOOOO+5buaeYprh8raZpOZeX/t6BO+6444477rjjjjvuuOOOO+6444477rjjPs5dHZOtq1r2v20OuOOOO+6444477rjjjjvuuOOOO+6444477lu5T9coqRorVce0ME3N4Y1mDXfccccdd9xxxx133HHHHXfccccdd9xxx/0C93Z2qZqspZ4r+kzgjjvuuOOOO+6444477rjjjjvuuOOOO+64R7lvq41S12N6Pu21V1H9hDvuuOOOO+6444477rjjjjvuuOOOO+64417FPVVbbPvdbXXSC4xa3gt33HHHHXfccccdd9xxxx133HHHHXfccccd90Pjbl9/4POHO+6444477rjjjjvuuOOOO+6444477rjjvpJ7itHVGmV6PtO8imoy3HHHHXfccccdd9xxxx133HHHHXfccccd9yj3FK+W56fYtddSwefgjjvuuOOOO+6444477rjjjjvuuOOOO+64n+DeUkOk6q1t7NrrKtxxxx133HHHHXfccccdd9xxxx133HHHHXfcd4x7W93WUv+lPBypmXDHHXfccccdd9xxxx133HHHHXfccccdd9zra4iW52y7NimmR2om3HHHHXfccccdd9xxxx133HHHHXfccccd9/o8NaaW65eaT1GdhzvuuOOOO+6444477rjjjjvuuOOOO+644x7l/ivJ9LhTx9PCsWX/uOOOO+6444477rjjjjvuuOOOO+6444477lu5t9dGLcc5/V7tNdZLNRPuuOOOO+6444477rjjjjvuuOOOO+644457jHtLbTRdA6WuTeq8WmpH3HHHHXfccccdd9xxxx133HHHHXfccccdd9y/cZzT1yxV96SuPe6444477rjjjjvuuOOOO+6444477rjjjjvuO8aRen6qZkrtM7gf3HHHHXfccccdd9xxxx133HHHHXfccccd9yru22qLq/XT9GcoVRuV1Uy444477rjjjjvuuOOOO+6444477rjjjjvuj3FvYZGqObbtv6WWemFuuOOOO+6444477rjjjjvuuOOOO+6444477lHuIseCu+AugrsI7iK4i+AugrsI7iLP5R9Tj2n9EwfwFQAAAABJRU5ErkJggg=='
        }, {
          'name': 'XM',
          'value': '陶小红'
        }, {
          'name': 'zl',
          'value': '杭州市盛世钱塘花园*幢*单元***室'
        }, {
          'name': 'fwyt',
          'value': '住宅'
        }, {
          'name': 'scjzmj',
          'value': '168.26'
        }, {
          'name': 'syqx',
          'value': '2074-07-15'
        }, {
          'name': 'xzxx',
          'value': '房产:无查封,有抵押,宗地:无查封,有抵押'
        }, {
          'name': 'zdh',
          'value': '33010400******B00010'
        }, {
          'name': 'bdcqzh',
          'value': '杭房权证江移字第096****号、杭房权证江移字第****号'
        }, {
          'name': 'qlr',
          'value': '陈*平、陶*'
        }, {
          'name': 'qlxz',
          'value': '/存量房产'
        }, {
          'name': 'qllx',
          'value': '房屋（构筑物）所有权'
        }, {
          'name': 'gyqk',
          'value': '共同共有'
        }, {
          'name': 'djsj',
          'value': '2009-05-12'
        }, {
          'name': 'qszt',
          'value': '已转移'
        }, {
          'name': 'zyzxsj',
          'value': '2015-07-02'
        }, {
          'name': 'fj',
          'value': '总层数含地下二层\r该房为陈*平、陶*共同共有'
        }],
        'dynamicDataList': [],
        'dynamicDataList2': [],
        'dynamicDataList3': null,
        'dynamicDataList4': null,
        'dynamicDataList5': null
      }, {
        'bh': '1001025-201904-01204625-0',
        'zl': '城北商贸园**幢*单元**室',
        'houseCount': null,
        'staticDataList': [{
          'name': 'ywbh',
          'value': '1001025-201904-01204625'
        }, {
          'name': 'ewm',
          'value': 'iVBORw0KGgoAAAANSUhEUgAAAPoAAAD6CAIAAAAHjs1qAAAEqElEQVR42u3bwZHDMAwDwPTf9F0TpkHQi7fGkamVP5j8/kQ+k58RCO4iuIvgLoK7CO4iuIvgLvIK919JHpvFst/dtv8DHnDHHXfccccdd9xxxx133HHHHXfccccdd9xXco91BCXcn1o/ffzT6xd6wB133HHHHXfccccdd9xxxx133HHHHXfcca/i3nI8246tfZ4t+8cdd9xxxx133HHHHXfccccdd9xxxx133HHHfffxXK3JcMcdd9xxxx133HHHHXfccccdd9xxxx133HHHfdOxpfavZsIdd9xxxx133HHHHXfccccdd9xxxx133HG/xX06LVxSx9zyuQl6wB133HHHHXfccccdd9xxxx133HHHHXfccV/JfVu21ShfW9/iAXfrccfdetxxtx533HHHHXfccccdd9xxxz3N/Wt5cKyjXLbVdk1HTDnuuOOOO+6444477rjjjjvuuOOOO+64436B+3RtNM0x9V7t1yl1jrjjjjvuuOOOO+6444477rjjjjvuuOOOO+5buaeYprh8raZpOZeX/t6BO+6444477rjjjjvuuOOOO+6444477rjjPs5dHZOtq1r2v20OuOOOO+6444477rjjjjvuuOOOO+6444477lu5T9coqRorVce0ME3N4Y1mDXfccccdd9xxxx133HHHHXfccccdd9xxx/0C93Z2qZqspZ4r+kzgjjvuuOOOO+6444477rjjjjvuuOOOO+64R7lvq41S12N6Pu21V1H9hDvuuOOOO+6444477rjjjjvuuOOOO+64417FPVVbbPvdbXXSC4xa3gt33HHHHXfccccdd9xxxx133HHHHXfccccd90Pjbl9/4POHO+6444477rjjjjvuuOOOO+6444477rjjvpJ7itHVGmV6PtO8imoy3HHHHXfccccdd9xxxx133HHHHXfccccd9yj3FK+W56fYtddSwefgjjvuuOOOO+6444477rjjjjvuuOOOO+64n+DeUkOk6q1t7NrrKtxxxx133HHHHXfccccdd9xxxx133HHHHXfcd4x7W93WUv+lPBypmXDHHXfccccdd9xxxx133HHHHXfccccdd9zra4iW52y7NimmR2om3HHHHXfccccdd9xxxx133HHHHXfccccd9/o8NaaW65eaT1GdhzvuuOOOO+6444477rjjjjvuuOOOO+644x7l/ivJ9LhTx9PCsWX/uOOOO+6444477rjjjjvuuOOOO+6444477lu5t9dGLcc5/V7tNdZLNRPuuOOOO+6444477rjjjjvuuOOOO+644457jHtLbTRdA6WuTeq8WmpH3HHHHXfccccdd9xxxx133HHHHXfccccdd9y/cZzT1yxV96SuPe6444477rjjjjvuuOOOO+6444477rjjjjvuO8aRen6qZkrtM7gf3HHHHXfccccdd9xxxx133HHHHXfccccd9yru22qLq/XT9GcoVRuV1Uy444477rjjjjvuuOOOO+6444477rjjjjvuj3FvYZGqObbtv6WWemFuuOOOO+6444477rjjjjvuuOOOO+6444477lHuIseCu+AugrsI7iK4i+AugrsI7iLP5R9Tj2n9EwfwFQAAAABJRU5ErkJggg=='
        }, {
          'name': 'XM',
          'value': '陶小红'
        }, {
          'name': 'zl',
          'value': '城北商贸园**幢*单元**室'
        }, {
          'name': 'fwyt',
          'value': '住宅'
        }, {
          'name': 'scjzmj',
          'value': '129.46'
        }, {
          'name': 'syqx',
          'value': '2065-12-31'
        }, {
          'name': 'xzxx',
          'value': '房产:有查封,有抵押,宗地:有查封,无抵押'
        }, {
          'name': 'zdh',
          'value': '330106006015GB00054'
        }, {
          'name': 'bdcqzh',
          'value': '杭房权证西移字第****号'
        }, {
          'name': 'qlr',
          'value': '陶小红'
        }, {
          'name': 'qlxz',
          'value': '/存量房产'
        }, {
          'name': 'qllx',
          'value': '房屋（构筑物）所有权'
        }, {
          'name': 'gyqk',
          'value': '单独所有'
        }, {
          'name': 'djsj',
          'value': '2002-08-20'
        }, {
          'name': 'qszt',
          'value': '现状'
        }, {
          'name': 'zyzxsj',
          'value': ''
        }, {
          'name': 'fj',
          'value': ''
        }],
        'dynamicDataList': [
          [{
            'name': 'dyqlr',
            'value': '温州银行股份有限公司杭州分行'
          }, {
            'name': 'djzmh',
            'value': '杭房他证字第****号'
          }, {
            'name': 'dyfs',
            'value': '最高额抵押'
          }, {
            'name': 'zgzqse',
            'value': '200'
          }, {
            'name': 'dyaqdjsj',
            'value': '2014-06-12'
          }, {
            'name': 'zwlxqx',
            'value': '2014年06月09日至2016年06月30日止'
          }, {
            'name': 'dyfj',
            'value': '最高额抵押权 \r\n'
          }]
        ],
        'dynamicDataList2': [
          [{
            'name': 'cfwh',
            'value': '（2016）浙0106执5046、5047、5048号（原查封文号为[2016]浙0106民初2*8、2*9、2*0号）'
          }, {
            'name': 'cfjg',
            'value': '西湖区人民法院'
          }, {
            'name': 'cfqx',
            'value': '2019年04月05日至2022年04月04日止'
          }],
          [{
            'name': 'cfwh',
            'value': '[2016]浙0106民初2*4、2*5、2*6号'
          }, {
            'name': 'cfjg',
            'value': '西湖区人民法院'
          }, {
            'name': 'cfqx',
            'value': '2016年03月28日至2019年03月27日止'
          }],
          [{
            'name': 'cfwh',
            'value': '（2016）浙0503执保4*7号'
          }, {
            'name': 'cfjg',
            'value': '浙江省湖州市南浔区人民法院'
          }, {
            'name': 'cfqx',
            'value': '2016年10月11日至2019年10月10日止'
          }],
          [{
            'name': 'cfwh',
            'value': '[2015]杭江执民字第1231号'
          }, {
            'name': 'cfjg',
            'value': '江干区人民法院'
          }, {
            'name': 'cfqx',
            'value': '2015年08月03日至2018年08月02日止'
          }],
          [{
            'name': 'cfwh',
            'value': '[2016]浙0106民初2408、2409、2410号'
          }, {
            'name': 'cfjg',
            'value': '西湖区人民法院'
          }, {
            'name': 'cfqx',
            'value': '2016年04月05日至2019年04月04日止'
          }],
          [{
            'name': 'cfwh',
            'value': '（2018）浙0503执545号'
          }, {
            'name': 'cfjg',
            'value': '浙江省湖州市南浔区人民法院'
          }, {
            'name': 'cfqx',
            'value': '2018年03月12日至2021年03月11日止'
          }],
          [{
            'name': 'cfwh',
            'value': '[2015]湖浔民保字第72号'
          }, {
            'name': 'cfjg',
            'value': '湖州市南浔区人民法院'
          }, {
            'name': 'cfqx',
            'value': '2015年11月06日至2018年11月05日止'
          }],
          [{
            'name': 'cfwh',
            'value': '（2016）浙0106民初7327号'
          }, {
            'name': 'cfjg',
            'value': '杭州市西湖区人民法院'
          }, {
            'name': 'cfqx',
            'value': '2016年09月30日至2019年09月29日止'
          }],
          [{
            'name': 'cfwh',
            'value': '[2016]浙0103民初01861-1号'
          }, {
            'name': 'cfjg',
            'value': '下城区人民法院'
          }, {
            'name': 'cfqx',
            'value': '2016年04月25日至2019年04月24日止'
          }]
        ],
        'dynamicDataList3': null,
        'dynamicDataList4': null,
        'dynamicDataList5': null
      }, {
        'bh': '1001025-201904-01204625-0',
        'zl': '城北商贸园28幢2单元302室',
        'houseCount': null,
        'staticDataList': [{
          'name': 'ywbh',
          'value': '1001025-201904-01204625'
        }, {
          'name': 'ewm',
          'value': 'iVBORw0KGgoAAAANSUhEUgAAAPoAAAD6CAIAAAAHjs1qAAAEqElEQVR42u3bwZHDMAwDwPTf9F0TpkHQi7fGkamVP5j8/kQ+k58RCO4iuIvgLoK7CO4iuIvgLvIK919JHpvFst/dtv8DHnDHHXfccccdd9xxxx133HHHHXfccccdd9xXco91BCXcn1o/ffzT6xd6wB133HHHHXfccccdd9xxxx133HHHHXfcca/i3nI8246tfZ4t+8cdd9xxxx133HHHHXfccccdd9xxxx133HHHfffxXK3JcMcdd9xxxx133HHHHXfccccdd9xxxx133HHHfdOxpfavZsIdd9xxxx133HHHHXfccccdd9xxxx133HG/xX06LVxSx9zyuQl6wB133HHHHXfccccdd9xxxx133HHHHXfccV/JfVu21ShfW9/iAXfrccfdetxxtx533HHHHXfccccdd9xxxz3N/Wt5cKyjXLbVdk1HTDnuuOOOO+6444477rjjjjvuuOOOO+64436B+3RtNM0x9V7t1yl1jrjjjjvuuOOOO+6444477rjjjjvuuOOOO+5buaeYprh8raZpOZeX/t6BO+6444477rjjjjvuuOOOO+6444477rjjPs5dHZOtq1r2v20OuOOOO+6444477rjjjjvuuOOOO+6444477lu5T9coqRorVce0ME3N4Y1mDXfccccdd9xxxx133HHHHXfccccdd9xxx/0C93Z2qZqspZ4r+kzgjjvuuOOOO+6444477rjjjjvuuOOOO+64R7lvq41S12N6Pu21V1H9hDvuuOOOO+6444477rjjjjvuuOOOO+64417FPVVbbPvdbXXSC4xa3gt33HHHHXfccccdd9xxxx133HHHHXfccccd90Pjbl9/4POHO+6444477rjjjjvuuOOOO+6444477rjjvpJ7itHVGmV6PtO8imoy3HHHHXfccccdd9xxxx133HHHHXfccccd9yj3FK+W56fYtddSwefgjjvuuOOOO+6444477rjjjjvuuOOOO+64n+DeUkOk6q1t7NrrKtxxxx133HHHHXfccccdd9xxxx133HHHHXfcd4x7W93WUv+lPBypmXDHHXfccccdd9xxxx133HHHHXfccccdd9zra4iW52y7NimmR2om3HHHHXfccccdd9xxxx133HHHHXfccccd9/o8NaaW65eaT1GdhzvuuOOOO+6444477rjjjjvuuOOOO+644x7l/ivJ9LhTx9PCsWX/uOOOO+6444477rjjjjvuuOOOO+6444477lu5t9dGLcc5/V7tNdZLNRPuuOOOO+6444477rjjjjvuuOOOO+644457jHtLbTRdA6WuTeq8WmpH3HHHHXfccccdd9xxxx133HHHHXfccccdd9y/cZzT1yxV96SuPe6444477rjjjjvuuOOOO+6444477rjjjjvuO8aRen6qZkrtM7gf3HHHHXfccccdd9xxxx133HHHHXfccccd9yru22qLq/XT9GcoVRuV1Uy444477rjjjjvuuOOOO+6444477rjjjjvuj3FvYZGqObbtv6WWemFuuOOOO+6444477rjjjjvuuOOOO+6444477lHuIseCu+AugrsI7iK4i+AugrsI7iLP5R9Tj2n9EwfwFQAAAABJRU5ErkJggg=='
        }, {
          'name': 'XM',
          'value': '陶小红'
        }, {
          'name': 'zl',
          'value': '城北商贸园28幢2单元302室'
        }, {
          'name': 'fwyt',
          'value': '住宅'
        }, {
          'name': 'scjzmj',
          'value': '129.46'
        }, {
          'name': 'syqx',
          'value': '2065-12-31'
        }, {
          'name': 'xzxx',
          'value': '房产:无查封,有抵押,宗地:无查封,无抵押'
        }, {
          'name': 'zdh',
          'value': '330106006015GB000'
        }, {
          'name': 'gyqk',
          'value': '单独所有'
        }, {
          'name': 'djsj',
          'value': '2002-08-20'
        }, {
          'name': 'qszt',
          'value': '已转移'
        }, {
          'name': 'zyzxsj',
          'value': '2009-05-27'
        }, {
          'name': 'fj',
          'value': ''
        }],
        'dynamicDataList': [],
        'dynamicDataList2': [],
        'dynamicDataList3': null,
        'dynamicDataList4': null,
        'dynamicDataList5': null
      }, {
        'bh': '1001025-201904-01204625-0',
        'zl': '萧山区宁围镇景海湾逸湖居9幢2号',
        'houseCount': null,
        'staticDataList': [{
          'name': 'ywbh',
          'value': '1001025-201904-01204625'
        }, {
          'name': 'ewm',
          'value': 'iVBORw0KGgoAAAANSUhEUgAAAPoAAAD6CAIAAAAHjs1qAAAEqElEQVR42u3bwZHDMAwDwPTf9F0TpkHQi7fGkamVP5j8/kQ+k58RCO4iuIvgLoK7CO4iuIvgLvIK919JHpvFst/dtv8DHnDHHXfccccdd9xxxx133HHHHXfccccdd9xXco91BCXcn1o/ffzT6xd6wB133HHHHXfccccdd9xxxx133HHHHXfcca/i3nI8246tfZ4t+8cdd9xxxx133HHHHXfccccdd9xxxx133HHHfffxXK3JcMcdd9xxxx133HHHHXfccccdd9xxxx133HHHfdOxpfavZsIdd9xxxx133HHHHXfccccdd9xxxx133HG/xX06LVxSx9zyuQl6wB133HHHHXfccccdd9xxxx133HHHHXfccV/JfVu21ShfW9/iAXfrccfdetxxtx533HHHHXfccccdd9xxxz3N/Wt5cKyjXLbVdk1HTDnuuOOOO+6444477rjjjjvuuOOOO+64436B+3RtNM0x9V7t1yl1jrjjjjvuuOOOO+6444477rjjjjvuuOOOO+5buaeYprh8raZpOZeX/t6BO+6444477rjjjjvuuOOOO+6444477rjjPs5dHZOtq1r2v20OuOOOO+6444477rjjjjvuuOOOO+6444477lu5T9coqRorVce0ME3N4Y1mDXfccccdd9xxxx133HHHHXfccccdd9xxx/0C93Z2qZqspZ4r+kzgjjvuuOOOO+6444477rjjjjvuuOOOO+64R7lvq41S12N6Pu21V1H9hDvuuOOOO+6444477rjjjjvuuOOOO+64417FPVVbbPvdbXXSC4xa3gt33HHHHXfccccdd9xxxx133HHHHXfccccd90Pjbl9/4POHO+6444477rjjjjvuuOOOO+6444477rjjvpJ7itHVGmV6PtO8imoy3HHHHXfccccdd9xxxx133HHHHXfccccd9yj3FK+W56fYtddSwefgjjvuuOOOO+6444477rjjjjvuuOOOO+64n+DeUkOk6q1t7NrrKtxxxx133HHHHXfccccdd9xxxx133HHHHXfcd4x7W93WUv+lPBypmXDHHXfccccdd9xxxx133HHHHXfccccdd9zra4iW52y7NimmR2om3HHHHXfccccdd9xxxx133HHHHXfccccd9/o8NaaW65eaT1GdhzvuuOOOO+6444477rjjjjvuuOOOO+644x7l/ivJ9LhTx9PCsWX/uOOOO+6444477rjjjjvuuOOOO+6444477lu5t9dGLcc5/V7tNdZLNRPuuOOOO+6444477rjjjjvuuOOOO+644457jHtLbTRdA6WuTeq8WmpH3HHHHXfccccdd9xxxx133HHHHXfccccdd9y/cZzT1yxV96SuPe6444477rjjjjvuuOOOO+6444477rjjjjvuO8aRen6qZkrtM7gf3HHHHXfccccdd9xxxx133HHHHXfccccd9yru22qLq/XT9GcoVRuV1Uy444477rjjjjvuuOOOO+6444477rjjjjvuj3FvYZGqObbtv6WWemFuuOOOO+6444477rjjjjvuuOOOO+6444477lHuIseCu+AugrsI7iK4i+AugrsI7iLP5R9Tj2n9EwfwFQAAAABJRU5ErkJggg=='
        }, {
          'name': 'XM',
          'value': '陶小红'
        }, {
          'name': 'zl',
          'value': '萧山区宁围镇景海湾逸湖居9幢2号'
        }, {
          'name': 'fwyt',
          'value': '住宅'
        }, {
          'name': 'scjzmj',
          'value': '277.72'
        }, {
          'name': 'syqx',
          'value': '2072-12-31'
        }, {
          'name': 'xzxx',
          'value': '房产:无查封,有抵押,宗地:无查封,无抵押'
        }, {
          'name': 'zdh',
          'value': '330109008010GB00024'
        }, {
          'name': 'bdcqzh',
          'value': '杭房权证萧移字第00179653号、杭房权证萧移字第001***2号'
        }, {
          'name': 'qlr',
          'value': '陶小红、陈*平'
        }, {
          'name': 'qlxz',
          'value': '/存量房产'
        }, {
          'name': 'qllx',
          'value': '房屋（构筑物）所有权'
        }, {
          'name': 'gyqk',
          'value': '共同共有'
        }, {
          'name': 'djsj',
          'value': '2012-09-04'
        }, {
          'name': 'qszt',
          'value': '已转移'
        }, {
          'name': 'zyzxsj',
          'value': '2017-05-02'
        }, {
          'name': 'fj',
          'value': '陈相平、陶小红占有份额为共同共有。'
        }],
        'dynamicDataList': [],
        'dynamicDataList2': [],
        'dynamicDataList3': null,
        'dynamicDataList4': null,
        'dynamicDataList5': null
      }]
  },
  dz: {
    // 打证明机配置
    // ocr扫描次数(+1次,填写5则每本证扫6次)------(扫到了值的情况下重复扫取的扫描次数)(+1次)
    ocrLast: 2,
    // ocr允许最大扫描次数(+1次) ------(一直扫不到值的情况下最多扫描次数)(+1次)
    ocrMost: 15,
    // 打印最长时间
    printTime: 120,
    // 起止号---正逆序(true为正序，false为逆序)
    order: true,
    //打证纸盒
    parperbox: 5
  },
  dzs: {
    // 起止号---正逆序(true为正序，false为逆序)
    order: true
  }
};
