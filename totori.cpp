#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    double ans=0;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a.begin(),a.end());

    for(int i=0;i<n;i++){
        if(i==0){
            ans+=a[i];
        }
        else{
            ans=(ans+a[i])/2.0000000;
        }
    }
    cout<<fixed<<setprecision(6)<<ans<<endl;
}




      





