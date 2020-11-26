#include <bits/stdc++.h>
#define rep(i,n) for(int i=0;i<n;i++)
using namespace std;
using ll=long long int;

int main(){
  double n;
  cin>>n;

  int x=n/1.08;
  int ans=0;

  for(int i=-1;i<2;i++){
    if((x+i)*1.08==n){
      ans=x+i;
    }
  }

  if(ans==0){
    cout<<":("<<endl;
  }
  else{
    cout<<ans<<endl;
  }
}


